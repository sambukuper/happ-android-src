// Java_libxray_Libxray_00024proxyProcessFinder_findProcessByConnection @ 01c6fa24 size=188
// callers:
//   Entry Point ?

void Java_libxray_Libxray_00024proxyProcessFinder_findProcessByConnection
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5,undefined8 param_6)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  
  uVar1 = go_seq_to_refnum_go();
  uVar1 = uVar1 & 0xffffffff;
  auVar2 = go_seq_from_java_string(param_1,param_3);
  auVar3 = go_seq_from_java_string(param_1,param_4);
  auVar4 = go_seq_from_java_string(param_1,param_6);
  proxylibxray_ProcessFinder_FindProcessByConnection
            (uVar1 & 0xffffffff,auVar2._0_8_,auVar2._8_8_,auVar3._0_8_,auVar3._8_8_,param_5,
             auVar4._0_8_,auVar4._8_8_);
  return;
}


