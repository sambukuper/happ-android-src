.class public final Ljm1;
.super Lq97;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lml1;


# instance fields
.field public final H0:Lvy5;

.field public final I0:Lw15;

.field public final J0:Lux4;

.field public final K0:Ldv8;

.field public final L0:Lxl1;


# direct methods
.method public constructor <init>(Led1;Lq97;Lsm;Lv15;ILvy5;Lw15;Lux4;Ldv8;Lxl1;Lke7;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eqz p5, :cond_1

    .line 8
    .line 9
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-nez p11, :cond_0

    .line 16
    .line 17
    sget-object v0, Lke7;->G:Lg55;

    .line 18
    .line 19
    move-object v6, v0

    .line 20
    move-object v1, p1

    .line 21
    move-object v2, p2

    .line 22
    move-object v3, p3

    .line 23
    move-object v4, p4

    .line 24
    move v5, p5

    .line 25
    move-object v0, p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object/from16 v6, p11

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    move-object v1, p1

    .line 31
    move-object v2, p2

    .line 32
    move-object v3, p3

    .line 33
    move-object v4, p4

    .line 34
    move v5, p5

    .line 35
    :goto_0
    invoke-direct/range {v0 .. v6}, Lq97;-><init>(Led1;Lq97;Lsm;Lv15;ILke7;)V

    .line 36
    .line 37
    .line 38
    iput-object p6, p0, Ljm1;->H0:Lvy5;

    .line 39
    .line 40
    iput-object p7, p0, Ljm1;->I0:Lw15;

    .line 41
    .line 42
    iput-object p8, p0, Ljm1;->J0:Lux4;

    .line 43
    .line 44
    move-object/from16 v1, p9

    .line 45
    .line 46
    iput-object v1, p0, Ljm1;->K0:Ldv8;

    .line 47
    .line 48
    move-object/from16 v1, p10

    .line 49
    .line 50
    iput-object v1, p0, Ljm1;->L0:Lxl1;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    throw v0
.end method


# virtual methods
.method public final G()Lux4;
    .locals 0

    .line 1
    iget-object p0, p0, Ljm1;->J0:Lux4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final I0(ILsm;Led1;Lho2;Lv15;Lke7;)Ljo2;
    .locals 12

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljm1;

    .line 10
    .line 11
    move-object/from16 v2, p4

    .line 12
    .line 13
    check-cast v2, Lq97;

    .line 14
    .line 15
    if-nez p5, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v4, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object/from16 v4, p5

    .line 27
    .line 28
    :goto_0
    iget-object v9, p0, Ljm1;->K0:Ldv8;

    .line 29
    .line 30
    iget-object v10, p0, Ljm1;->L0:Lxl1;

    .line 31
    .line 32
    iget-object v6, p0, Ljm1;->H0:Lvy5;

    .line 33
    .line 34
    iget-object v7, p0, Ljm1;->I0:Lw15;

    .line 35
    .line 36
    iget-object v8, p0, Ljm1;->J0:Lux4;

    .line 37
    .line 38
    move v5, p1

    .line 39
    move-object v3, p2

    .line 40
    move-object v1, p3

    .line 41
    move-object/from16 v11, p6

    .line 42
    .line 43
    invoke-direct/range {v0 .. v11}, Ljm1;-><init>(Led1;Lq97;Lsm;Lv15;ILvy5;Lw15;Lux4;Ldv8;Lxl1;Lke7;)V

    .line 44
    .line 45
    .line 46
    iget-boolean p0, p0, Ljo2;->z0:Z

    .line 47
    .line 48
    iput-boolean p0, v0, Ljo2;->z0:Z

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    const/4 p0, 0x0

    .line 52
    throw p0
.end method

.method public final M()Lw15;
    .locals 0

    .line 1
    iget-object p0, p0, Ljm1;->I0:Lw15;

    .line 2
    .line 3
    return-object p0
.end method

.method public final N()Lxl1;
    .locals 0

    .line 1
    iget-object p0, p0, Ljm1;->L0:Lxl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x()Ld2;
    .locals 0

    .line 1
    iget-object p0, p0, Ljm1;->H0:Lvy5;

    .line 2
    .line 3
    return-object p0
.end method
