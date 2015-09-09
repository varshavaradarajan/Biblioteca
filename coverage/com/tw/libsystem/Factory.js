var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":24,"id":772,"methods":[{"el":13,"sc":5,"sl":10},{"el":18,"sc":5,"sl":15},{"el":23,"sc":5,"sl":20}],"name":"Factory","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_167":{"methods":[{"sl":10}],"name":"shouldDelegateDisplayingMessageToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_176":{"methods":[{"sl":10}],"name":"shouldDisplayAMessageAfterAnOperationIsExecute","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_306":{"methods":[{"sl":20}],"name":"shouldReturnNewParserObject","pass":true,"statements":[{"sl":21},{"sl":22}]},"test_408":{"methods":[{"sl":10}],"name":"shouldDelegateDisplayingOfMenuToDisplayClass","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_6":{"methods":[{"sl":15}],"name":"shouldReturnNewInputViewObjects","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_63":{"methods":[{"sl":10}],"name":"shouldReturnNewDisplayObjects","pass":true,"statements":[{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [408, 167, 176, 63], [408, 167, 176, 63], [408, 167, 176, 63], [], [], [6], [6], [6], [], [], [306], [306], [306], [], []]
