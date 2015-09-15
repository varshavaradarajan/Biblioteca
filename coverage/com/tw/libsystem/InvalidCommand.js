var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":21,"methods":[{"el":12,"sc":5,"sl":8},{"el":16,"sc":5,"sl":14}],"name":"InvalidCommand","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_126":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_144":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_159":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_195":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_206":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_209":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_264":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_278":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_361":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_372":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_393":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_458":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_461":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_507":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_510":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_563":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_586":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_618":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_62":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_635":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_646":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_705":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_796":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_857":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_875":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_893":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_898":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_993":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [510, 857, 278, 618, 195, 372, 461, 458, 796, 144, 893, 126, 705, 507, 875, 361, 159, 586, 635, 646, 264, 563, 393, 206, 62, 209, 993, 898], [], [510, 857, 278, 618, 195, 372, 461, 458, 796, 144, 893, 126, 705, 507, 875, 361, 159, 586, 635, 646, 264, 563, 393, 206, 62, 209, 993, 898], [510, 857, 278, 618, 195, 372, 461, 458, 796, 144, 893, 126, 705, 507, 875, 361, 159, 586, 635, 646, 264, 563, 393, 206, 62, 209, 993, 898], [], [], [510, 857, 278, 618, 195, 372, 461, 458, 796, 144, 893, 126, 705, 507, 875, 361, 159, 586, 635, 646, 264, 563, 393, 206, 62, 209, 993, 898], [510, 857, 278, 618, 195, 372, 461, 458, 796, 144, 893, 126, 705, 507, 875, 361, 159, 586, 635, 646, 264, 563, 393, 206, 62, 209, 993, 898], [], []]
