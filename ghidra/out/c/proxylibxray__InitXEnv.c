// proxylibxray__InitXEnv @ 01c6e6f4 size=112
// callers:
//   Entry Point ?
//   01c6f0b4 Java_libxray_Libxray_initXEnv

void proxylibxray__InitXEnv
               (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  undefined8 local_40;
  
  uVar1 = _cgo_wait_runtime_init_done();
  local_58 = param_1;
  uStack_50 = param_2;
  local_48 = param_3;
  local_40 = param_4;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__InitXEnv,&local_58,0x20,uVar1);
  _cgo_release_context(uVar1);
  return;
}


