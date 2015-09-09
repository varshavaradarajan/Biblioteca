var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":760,"methods":[{"el":18,"sc":5,"sl":15},{"el":23,"sc":5,"sl":20},{"el":31,"sc":5,"sl":25},{"el":39,"sc":5,"sl":33}],"name":"CheckOutTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_140":{"methods":[{"sl":25}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":30}]},"test_148":{"methods":[{"sl":33}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":38}]},"test_308":{"methods":[{"sl":25}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":30}]},"test_435":{"methods":[{"sl":33}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [140, 308], [], [140, 308], [140, 308], [], [140, 308], [], [], [435, 148], [], [435, 148], [435, 148], [], [435, 148], [], [], []]
