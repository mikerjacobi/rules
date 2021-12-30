import warnings; warnings.filterwarnings('ignore')
import requests
import json
from pprint import pprint as pp

base = "http://jacobi.sockhop.me"
port = 8080
user = "admin"
pw = "admin"
kie_session = "defaultSession"
container_id = "doit_1.0.0-SNAPSHOT"

class Idea:
  def __init__(self, id, desc="", upside=0, downside=0, cost=0, chance=0):
    self.type = "doit.doit.Idea"
    self.id = id
    self.desc = desc
    self.upside = upside
    self.downside = downside 
    self.cost = cost
    self.chance = chance
  def to_dict(self):
    return {
      "id": self.id, 
      "description": self.desc, 
      "upsideOfSuccess": self.upside, 
      "downsideOfFailure": self.downside, 
      "costToAttempt": self.cost,
      "successChance": self.chance,
    }

def insert(obj):
  return {"insert": {"object": { obj.type: obj.to_dict() }}}

def do(cmds):
  url = "%s:%s/kie-server/services/rest/server/containers/instances/%s"%(base, port, container_id)
  headers = {"Accept": "application/json", "Content-Type": "application/json"}
  auth = requests.auth.HTTPBasicAuth(user, pw)
  data = json.dumps({ "lookup": kie_session, "commands": cmds }, indent=2)
  # print(data)
  resp = requests.post(url, headers=headers, data=data, auth=auth)
  if resp.status_code != 200:
    raise Exception("failed to post, received code: ", resp.status_code)
  return resp.json()

def main():
  i1 = Idea(1, desc="do a barrel role", upside=1, downside=0, cost=1, chance=.9)
  i2 = Idea(2, desc="rob bank", upside=1, downside=0, cost=1, chance=.01)

  cmds = [
    insert(i1), 
    insert(i2), 
    #{"fire-all-rules": {}}, # not sure why this isn't necessary
    {"get-objects": {"out-identifier": "objects"}}
  ]

  resp = do(cmds)
  data = resp['result']['execution-results']['results']
  for r in data:
    pp(r["value"])

main()