// Java_libxray_Libxray_cutGeoData @ 01c6ef48 size=172
// callers:
//   Entry Point ?

void Java_libxray_Libxray_cutGeoData
               (int *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5)

{
  undefined4 uVar1;
  int iVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  
  auVar3 = go_seq_from_java_string(param_1,param_3);
  auVar4 = go_seq_from_java_string(param_1,param_4);
  auVar5 = go_seq_from_java_string(param_1,param_5);
  uVar1 = proxylibxray__CutGeoData
                    (auVar3._0_8_,auVar3._8_8_,auVar4._0_8_,auVar4._8_8_,auVar5._0_8_,auVar5._8_8_);
  iVar2 = go_seq_from_refnum(param_1,uVar1,proxy_class__error,proxy_class__error_cons);
  if (iVar2 != 0) {
                    /* WARNING: Could not recover jumptable at 0x01c6fe00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*param_1 + 0x68))();
    return;
  }
  return;
}


