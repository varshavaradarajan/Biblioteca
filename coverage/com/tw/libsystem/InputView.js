var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":793,"methods":[{"el":14,"sc":5,"sl":10}],"name":"InputView","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_130":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_176":{"methods":[{"sl":10}],"name":"shouldDisplayAMessageAfterAnOperationIsExecute","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_390":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_401":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [176, 130, 401, 390], [176, 130, 401, 390], [176, 130, 401, 390], [176, 130, 401, 390], [], []]
