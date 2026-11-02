// Java_libxray_Libxray_initXEnv @ 01c6f064 size=84
// callers:
//   Entry Point ?

void Java_libxray_Libxray_initXEnv
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 in_x21;
  undefined8 in_x22;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auStack_48 [16];
  undefined1 auStack_38 [16];
  undefined8 uStack_28;
  undefined8 local_20;
  undefined8 uStack_18;
  
  local_20 = in_x22;
  uStack_18 = in_x21;
  auVar2 = go_seq_from_java_string(param_1,param_3);
  auVar3 = go_seq_from_java_string(param_1,param_4);
  auStack_38._8_8_ = local_20;
  uStack_28 = uStack_18;
  uVar1 = _cgo_wait_runtime_init_done();
  auStack_38 = auVar3;
  auStack_48 = auVar2;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__InitXEnv,auStack_48,0x20,uVar1);
  _cgo_release_context(uVar1);
  return;
}


