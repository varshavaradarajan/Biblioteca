var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":1139,"methods":[{"el":19,"sc":5,"sl":14},{"el":27,"sc":5,"sl":21}],"name":"ExitApplicationTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_245":{"methods":[{"sl":21}],"name":"shouldExitFromTheApplication","pass":false,"statements":[{"sl":23},{"sl":24},{"sl":26}]},"test_356":{"methods":[{"sl":14}],"name":"shouldExitApplicationUponExecutionOfThisCommand","pass":true,"statements":[{"sl":16},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [356], [], [356], [], [356], [], [], [245], [], [245], [245], [], [245], [], []]
