// Java_libxray_Libxray_loadGeoFileRuleNames @ 01c6f0b8 size=120
// callers:
//   Entry Point ?

undefined8
Java_libxray_Libxray_loadGeoFileRuleNames(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined4 in_w20;
  undefined8 in_x29;
  undefined8 local_28;
  
  go_seq_from_java_string(param_1,param_3);
  proxylibxray__LoadGeoFileRuleNames();
  uVar1 = go_seq_to_java_string(param_1,local_28,in_x29);
  uVar2 = go_seq_from_refnum(param_1,in_w20,proxy_class__error,proxy_class__error_cons);
  go_seq_maybe_throw_exception(param_1,uVar2);
  return uVar1;
}


