var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":21,"methods":[{"el":12,"sc":5,"sl":8},{"el":16,"sc":5,"sl":14}],"name":"InvalidCommand","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1079":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_1093":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_1101":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_1123":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_1129":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_1240":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_15":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_171":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_192":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_213":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_262":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_274":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_277":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_343":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_359":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_465":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_479":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_503":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_583":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_586":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_638":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_641":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_707":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_734":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_776":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_800":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_817":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_87":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_893":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_900":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]},"test_999":{"methods":[{"sl":8},{"sl":14}],"name":"shouldReturnAMessageWhenTheOperationIsInvoked","pass":true,"statements":[{"sl":10},{"sl":11},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [641, 1079, 359, 776, 262, 479, 586, 583, 999, 192, 1093, 1123, 171, 893, 638, 1101, 465, 213, 734, 800, 817, 343, 707, 503, 274, 87, 277, 1240, 900, 15, 1129], [], [641, 1079, 359, 776, 262, 479, 586, 583, 999, 192, 1093, 1123, 171, 893, 638, 1101, 465, 213, 734, 800, 817, 343, 707, 503, 274, 87, 277, 1240, 900, 15, 1129], [641, 1079, 359, 776, 262, 479, 586, 583, 999, 192, 1093, 1123, 171, 893, 638, 1101, 465, 213, 734, 800, 817, 343, 707, 503, 274, 87, 277, 1240, 900, 15, 1129], [], [], [641, 1079, 359, 776, 262, 479, 586, 583, 999, 192, 1093, 1123, 171, 893, 638, 1101, 465, 213, 734, 800, 817, 343, 707, 503, 274, 87, 277, 1240, 900, 15, 1129], [641, 1079, 359, 776, 262, 479, 586, 583, 999, 192, 1093, 1123, 171, 893, 638, 1101, 465, 213, 734, 800, 817, 343, 707, 503, 274, 87, 277, 1240, 900, 15, 1129], [], []]
