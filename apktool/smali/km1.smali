.class public final Lkm1;
.super Lhd1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lam1;
.implements Lpt0;


# instance fields
.field public final i0:Lve4;

.field public final j0:Lfl1;

.field public k0:Ljava/util/List;

.field public final l0:Lg3;

.field public final m0:Lpz5;

.field public final n0:Lw15;

.field public final o0:Lux4;

.field public final p0:Ldv8;

.field public final q0:Lxl1;

.field public r0:Laa7;

.field public s0:Laa7;

.field public t0:Ljava/util/List;

.field public u0:Laa7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(Lve4;Led1;Lsm;Lv15;Lfl1;Lpz5;Lw15;Lux4;Ldv8;Lxl1;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lke7;->G:Lg55;

    .line 32
    .line 33
    invoke-direct {p0, p2, p3, p4, v0}, Lhd1;-><init>(Led1;Lsm;Lv15;Lke7;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lkm1;->i0:Lve4;

    .line 37
    .line 38
    iput-object p5, p0, Lkm1;->j0:Lfl1;

    .line 39
    .line 40
    new-instance p2, Lf3;

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p2, p0, p3}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lve4;->a(Ldn2;)Lte4;

    .line 47
    .line 48
    .line 49
    new-instance p1, Lg3;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Lg3;-><init>(Lkm1;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lkm1;->l0:Lg3;

    .line 55
    .line 56
    iput-object p6, p0, Lkm1;->m0:Lpz5;

    .line 57
    .line 58
    iput-object p7, p0, Lkm1;->n0:Lw15;

    .line 59
    .line 60
    iput-object p8, p0, Lkm1;->o0:Lux4;

    .line 61
    .line 62
    iput-object p9, p0, Lkm1;->p0:Ldv8;

    .line 63
    .line 64
    iput-object p10, p0, Lkm1;->q0:Lxl1;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final G()Lux4;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->o0:Lux4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final G0()Lgd1;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final H0()Lsx4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkm1;->I0()Laa7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lvr3;->J(Lt14;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lkm1;->I0()Laa7;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Llh8;->x()Lot0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    instance-of v0, p0, Lsx4;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p0, Lsx4;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final I0()Laa7;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->s0:Laa7;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "expandedType"

    .line 7
    .line 8
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lid1;->k(Lkm1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final J0()Laa7;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->r0:Laa7;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "underlyingType"

    .line 7
    .line 8
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final K0(Ljava/util/List;Laa7;Laa7;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkm1;->k0:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lkm1;->r0:Laa7;

    .line 10
    .line 11
    iput-object p3, p0, Lkm1;->s0:Laa7;

    .line 12
    .line 13
    invoke-static {p0}, Lpw7;->d(Lpt0;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lkm1;->t0:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {p0}, Lkm1;->H0()Lsx4;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lsx4;->r0()Let4;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    move-object v4, p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_1
    sget-object p1, Ldt4;->b:Ldt4;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_2
    new-instance v5, Lve7;

    .line 38
    .line 39
    const/16 p1, 0xc

    .line 40
    .line 41
    invoke-direct {v5, p0, p1}, Lve7;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    sget-object p2, Lcj8;->a:Lq32;

    .line 45
    .line 46
    invoke-static {p0}, Lu32;->f(Led1;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Lkm1;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    filled-new-array {p1}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object p2, Ls32;->m0:Ls32;

    .line 61
    .line 62
    invoke-static {p2, p1}, Lu32;->c(Ls32;[Ljava/lang/String;)Lq32;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    invoke-virtual {p0}, Lkm1;->l()Llh8;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    move-object p1, v1

    .line 74
    check-cast p1, Lg3;

    .line 75
    .line 76
    invoke-virtual {p1}, Lg3;->g()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Lcj8;->d(Ljava/util/List;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    sget-object p1, Lch8;->Y:Lxd6;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v0, Lch8;->Z:Lch8;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-static/range {v0 .. v5}, Ldh3;->P(Lch8;Llh8;Ljava/util/List;ZLet4;Lgn2;)Laa7;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :goto_3
    iput-object p1, p0, Lkm1;->u0:Laa7;

    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    invoke-static {p1}, Lcj8;->a(I)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    throw p0
.end method

.method public final M()Lw15;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->n0:Lw15;

    .line 2
    .line 3
    return-object p0
.end method

.method public final N()Lxl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->q0:Lxl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final X()Laa7;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->u0:Laa7;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "defaultTypeImpl"

    .line 7
    .line 8
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final a()Led1;
    .locals 0

    .line 2
    return-object p0
.end method

.method public final a()Lot0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final e()Lfl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->j0:Lfl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(Lwi8;)Lgd1;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lwi8;->a:Lui8;

    .line 5
    .line 6
    invoke-virtual {v0}, Lui8;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v1, Lkm1;

    .line 14
    .line 15
    invoke-virtual {p0}, Lhd1;->p()Led1;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcw0;->getAnnotations()Lsm;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v10, p0, Lkm1;->p0:Ldv8;

    .line 37
    .line 38
    iget-object v11, p0, Lkm1;->q0:Lxl1;

    .line 39
    .line 40
    iget-object v2, p0, Lkm1;->i0:Lve4;

    .line 41
    .line 42
    iget-object v6, p0, Lkm1;->j0:Lfl1;

    .line 43
    .line 44
    iget-object v7, p0, Lkm1;->m0:Lpz5;

    .line 45
    .line 46
    iget-object v8, p0, Lkm1;->n0:Lw15;

    .line 47
    .line 48
    iget-object v9, p0, Lkm1;->o0:Lux4;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v11}, Lkm1;-><init>(Lve4;Led1;Lsm;Lv15;Lfl1;Lpz5;Lw15;Lux4;Ldv8;Lxl1;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lkm1;->k0()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, Lkm1;->J0()Laa7;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    sget-object v3, Lrt8;->Z:Lrt8;

    .line 62
    .line 63
    invoke-virtual {p1, v2, v3}, Lwi8;->f(Lt14;Lrt8;)Lt14;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Ls08;->a(Lt14;)Laa7;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p0}, Lkm1;->I0()Laa7;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1, p0, v3}, Lwi8;->f(Lt14;Lrt8;)Lt14;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Ls08;->a(Lt14;)Laa7;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v1, v0, v2, p0}, Lkm1;->K0(Ljava/util/List;Laa7;Laa7;)V

    .line 84
    .line 85
    .line 86
    return-object v1
.end method

.method public final j0()Z
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

.method public final k0()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->k0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "declaredTypeParametersImpl"

    .line 7
    .line 8
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final l()Llh8;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->l0:Lg3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkm1;->J0()Laa7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lf0;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, p0, v2}, Lf0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    invoke-static {v0, v1, p0}, Lcj8;->c(Lt14;Lgn2;Lpc7;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "typealias "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lfd1;->getName()Lv15;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final x()Ld2;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm1;->m0:Lpz5;

    .line 2
    .line 3
    return-object p0
.end method
