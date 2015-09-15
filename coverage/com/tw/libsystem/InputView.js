var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":793,"methods":[{"el":14,"sc":5,"sl":10}],"name":"InputView","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":10}],"name":"shouldDisplayAMessageAfterAnOperationIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_110":{"methods":[{"sl":10}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_157":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_184":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_195":{"methods":[{"sl":10}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_227":{"methods":[{"sl":10}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_233":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_258":{"methods":[{"sl":10}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_260":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_278":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_29":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_306":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_310":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_320":{"methods":[{"sl":10}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_346":{"methods":[{"sl":10}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_372":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_411":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_418":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_438":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_444":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_465":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_468":{"methods":[{"sl":10}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_470":{"methods":[{"sl":10}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_486":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_507":{"methods":[{"sl":10}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_547":{"methods":[{"sl":10}],"name":"shouldReturnAMessageWhenCheckInIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_548":{"methods":[{"sl":10}],"name":"shouldReturnAppropriateCheckOutMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_570":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_577":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_59":{"methods":[{"sl":10}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_592":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_605":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_614":{"methods":[{"sl":10}],"name":"shouldReturnACheckedInMessageAfterCheckingInABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_615":{"methods":[{"sl":10}],"name":"shouldDisplayAMessageAfterAnOperationIsExecute","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_628":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_704":{"methods":[{"sl":10}],"name":"shouldDisplayAMessageAfterAnOperationIsExecuted","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_763":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_766":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_780":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_792":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_809":{"methods":[{"sl":10}],"name":"shouldReturnAppropriateCheckOutMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_822":{"methods":[{"sl":10}],"name":"shouldReturnTheInputValue","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_833":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_842":{"methods":[{"sl":10}],"name":"shouldReturnAMessageOnCheckingOutABook","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_849":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_903":{"methods":[{"sl":10}],"name":"shouldReturnACheckOutMessageOnCheckingOutAvailableBooks","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [470, 278, 258, 0, 411, 547, 195, 260, 372, 184, 792, 548, 465, 780, 842, 809, 157, 320, 310, 577, 849, 903, 766, 233, 227, 704, 59, 418, 438, 570, 29, 444, 486, 306, 110, 468, 833, 592, 614, 346, 615, 763, 628, 507, 605, 822], [470, 278, 258, 0, 411, 547, 195, 260, 372, 184, 792, 548, 465, 780, 842, 809, 157, 320, 310, 577, 849, 903, 766, 233, 227, 704, 59, 418, 438, 570, 29, 444, 486, 306, 110, 468, 833, 592, 614, 346, 615, 763, 628, 507, 605, 822], [470, 278, 258, 0, 411, 547, 195, 260, 372, 184, 792, 548, 465, 780, 842, 809, 157, 320, 310, 577, 849, 903, 766, 233, 227, 704, 59, 418, 438, 570, 29, 444, 486, 306, 110, 468, 833, 592, 614, 346, 615, 763, 628, 507, 605, 822], [470, 278, 258, 0, 411, 547, 195, 260, 372, 184, 792, 548, 465, 780, 842, 809, 157, 320, 310, 577, 849, 903, 766, 233, 227, 704, 59, 418, 438, 570, 29, 444, 486, 306, 110, 468, 833, 592, 614, 346, 615, 763, 628, 507, 605, 822], [], []]
