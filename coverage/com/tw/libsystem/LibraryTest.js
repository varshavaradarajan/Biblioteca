var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":58,"id":969,"methods":[{"el":15,"sc":5,"sl":10},{"el":23,"sc":5,"sl":17},{"el":31,"sc":5,"sl":25},{"el":39,"sc":5,"sl":33},{"el":48,"sc":5,"sl":41},{"el":56,"sc":5,"sl":50}],"name":"LibraryTest","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_105":{"methods":[{"sl":41}],"name":"shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":45},{"sl":47}]},"test_186":{"methods":[{"sl":33}],"name":"shouldReturnMessageIfBookIsRemoved","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":38}]},"test_219":{"methods":[{"sl":10}],"name":"shouldReturnTheContentsOfLibrary","pass":true,"statements":[{"sl":12},{"sl":14}]},"test_343":{"methods":[{"sl":17}],"name":"shouldReturnTrueIfLibraryHasABook","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":22}]},"test_394":{"methods":[{"sl":25}],"name":"shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":30}]},"test_426":{"methods":[{"sl":50}],"name":"shouldReturnAnotherMessageIfBookIsNotRemoved","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [219], [], [219], [], [219], [], [], [343], [], [343], [343], [], [343], [], [], [394], [], [394], [394], [], [394], [], [], [186], [], [186], [186], [], [186], [], [], [105], [], [105], [105], [105], [], [105], [], [], [426], [], [426], [426], [], [426], [], [], []]
