.class public final Lnl1;
.super Lgs0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lml1;


# instance fields
.field public final I0:Liy5;

.field public final J0:Lw15;

.field public final K0:Lux4;

.field public final L0:Ldv8;

.field public final M0:Lxl1;


# direct methods
.method public constructor <init>(Lsx4;La41;Lsm;ZILiy5;Lw15;Lux4;Ldv8;Lxl1;Lke7;)V
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
    move v4, p4

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
    move v4, p4

    .line 34
    move v5, p5

    .line 35
    :goto_0
    invoke-direct/range {v0 .. v6}, Lgs0;-><init>(Lsx4;La41;Lsm;ZILke7;)V

    .line 36
    .line 37
    .line 38
    iput-object p6, p0, Lnl1;->I0:Liy5;

    .line 39
    .line 40
    iput-object p7, p0, Lnl1;->J0:Lw15;

    .line 41
    .line 42
    iput-object p8, p0, Lnl1;->K0:Lux4;

    .line 43
    .line 44
    move-object/from16 v1, p9

    .line 45
    .line 46
    iput-object v1, p0, Lnl1;->L0:Ldv8;

    .line 47
    .line 48
    move-object/from16 v1, p10

    .line 49
    .line 50
    iput-object v1, p0, Lnl1;->M0:Lxl1;

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
.method public final F()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final G()Lux4;
    .locals 0

    .line 1
    iget-object p0, p0, Lnl1;->K0:Lux4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic I0(ILsm;Led1;Lho2;Lv15;Lke7;)Ljo2;
    .locals 0

    .line 1
    move-object p5, p3

    .line 2
    move p3, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p2

    .line 6
    move-object p2, p5

    .line 7
    move-object p5, p6

    .line 8
    invoke-virtual/range {p0 .. p5}, Lnl1;->X0(Led1;Lho2;ILsm;Lke7;)Lnl1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final M()Lw15;
    .locals 0

    .line 1
    iget-object p0, p0, Lnl1;->J0:Lw15;

    .line 2
    .line 3
    return-object p0
.end method

.method public final N()Lxl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lnl1;->M0:Lxl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge synthetic Q0(ILsm;Led1;Lho2;Lv15;Lke7;)Lgs0;
    .locals 0

    .line 1
    move-object p5, p3

    .line 2
    move p3, p1

    .line 3
    move-object p1, p5

    .line 4
    move-object p5, p4

    .line 5
    move-object p4, p2

    .line 6
    move-object p2, p5

    .line 7
    move-object p5, p6

    .line 8
    invoke-virtual/range {p0 .. p5}, Lnl1;->X0(Led1;Lho2;ILsm;Lke7;)Lnl1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final X0(Led1;Lho2;ILsm;Lke7;)Lnl1;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lnl1;

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Lsx4;

    .line 13
    .line 14
    move-object v2, p2

    .line 15
    check-cast v2, La41;

    .line 16
    .line 17
    iget-object v9, p0, Lnl1;->L0:Ldv8;

    .line 18
    .line 19
    iget-object v10, p0, Lnl1;->M0:Lxl1;

    .line 20
    .line 21
    iget-boolean v4, p0, Lgs0;->H0:Z

    .line 22
    .line 23
    iget-object v6, p0, Lnl1;->I0:Liy5;

    .line 24
    .line 25
    iget-object v7, p0, Lnl1;->J0:Lw15;

    .line 26
    .line 27
    iget-object v8, p0, Lnl1;->K0:Lux4;

    .line 28
    .line 29
    move v5, p3

    .line 30
    move-object/from16 v3, p4

    .line 31
    .line 32
    move-object/from16 v11, p5

    .line 33
    .line 34
    invoke-direct/range {v0 .. v11}, Lnl1;-><init>(Lsx4;La41;Lsm;ZILiy5;Lw15;Lux4;Ldv8;Lxl1;Lke7;)V

    .line 35
    .line 36
    .line 37
    iget-boolean p0, p0, Ljo2;->z0:Z

    .line 38
    .line 39
    iput-boolean p0, v0, Ljo2;->z0:Z

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    throw p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final x()Ld2;
    .locals 0

    .line 1
    iget-object p0, p0, Lnl1;->I0:Liy5;

    .line 2
    .line 3
    return-object p0
.end method
