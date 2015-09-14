var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":1127,"methods":[{"el":18,"sc":5,"sl":15},{"el":23,"sc":5,"sl":20},{"el":31,"sc":5,"sl":25},{"el":39,"sc":5,"sl":33}],"name":"CheckOutTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_444":{"methods":[{"sl":25}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":30}]},"test_597":{"methods":[{"sl":33}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [444], [], [444], [444], [], [444], [], [], [597], [], [597], [597], [], [597], [], []]
