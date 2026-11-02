// proxylibxray__GetWrapperVersion @ 01c6e6a4 size=80
// callers:
//   Entry Point ?
//   01c6f040 Java_libxray_Libxray_getWrapperVersion

undefined1  [16] proxylibxray__GetWrapperVersion(void)

{
  undefined1 auVar1 [16];
  undefined8 uVar2;
  undefined8 in_x19;
  undefined8 in_x30;
  undefined8 local_28;
  undefined8 local_20;
  undefined8 local_18;
  undefined8 local_10;
  
  local_18 = in_x30;
  local_10 = in_x19;
  uVar2 = _cgo_wait_runtime_init_done();
  local_28 = 0;
  local_20 = 0;
  crosscall2(_cgoexp_5994d4b84130_proxylibxray__GetWrapperVersion,&local_28,0x10,uVar2);
  _cgo_release_context(uVar2);
  auVar1._8_8_ = local_10;
  auVar1._0_8_ = local_18;
  return auVar1;
}


