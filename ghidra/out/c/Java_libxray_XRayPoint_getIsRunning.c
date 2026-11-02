// Java_libxray_XRayPoint_getIsRunning @ 01c6f97c size=32
// callers:
//   Entry Point ?

bool Java_libxray_XRayPoint_getIsRunning(void)

{
  char cVar1;
  
  go_seq_to_refnum_go();
  cVar1 = proxylibxray_XRayPoint_IsRunning_Get();
  return cVar1 != '\0';
}


