.class public final Lkj4;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Las2;
.implements Lrv1;
.implements Lw07;
.implements Lw85;


# instance fields
.field public A0:Lfi1;

.field public B0:Lvo5;

.field public final C0:Lrh5;

.field public D0:Lzi1;

.field public E0:J

.field public F0:Lpf3;

.field public G0:Lx90;

.field public final q0:Lz58;

.field public final r0:Lz58;

.field public final s0:F

.field public final t0:Z

.field public final u0:J

.field public final v0:F

.field public final w0:F

.field public final x0:Z

.field public final y0:Lwo5;

.field public z0:Landroid/view/View;


# direct methods
.method public constructor <init>(Lz58;Lz58;)V
    .locals 4

    .line 1
    sget-object v0, Llj4;->a:Le17;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x1c

    .line 7
    .line 8
    if-lt v0, v2, :cond_1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    sget-object v0, Lts2;->Y:Lts2;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lzo5;->X:Lzo5;

    .line 16
    .line 17
    :goto_0
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lkj4;->q0:Lz58;

    .line 21
    .line 22
    iput-object p2, p0, Lkj4;->r0:Lz58;

    .line 23
    .line 24
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 25
    .line 26
    iput p1, p0, Lkj4;->s0:F

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    iput-boolean p2, p0, Lkj4;->t0:Z

    .line 30
    .line 31
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    iput-wide v2, p0, Lkj4;->u0:J

    .line 37
    .line 38
    iput p1, p0, Lkj4;->v0:F

    .line 39
    .line 40
    iput p1, p0, Lkj4;->w0:F

    .line 41
    .line 42
    iput-boolean p2, p0, Lkj4;->x0:Z

    .line 43
    .line 44
    iput-object v0, p0, Lkj4;->y0:Lwo5;

    .line 45
    .line 46
    sget-object p1, Llh4;->i0:Llh4;

    .line 47
    .line 48
    new-instance p2, Lrh5;

    .line 49
    .line 50
    invoke-direct {p2, v1, p1}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 51
    .line 52
    .line 53
    iput-object p2, p0, Lkj4;->C0:Lrh5;

    .line 54
    .line 55
    iput-wide v2, p0, Lkj4;->E0:J

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    const-string p0, "Magnifier is only supported on API level 28 and higher."

    .line 59
    .line 60
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v1
.end method


# virtual methods
.method public final Q0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkj4;->q0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2, v2, v0}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lkj4;->G0:Lx90;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ltk0;

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-direct {v1, p0, v2, v3}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    sget-object v3, Le71;->f0:Le71;

    .line 25
    .line 26
    invoke-static {v0, v2, v3, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final R0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkj4;->B0:Lvo5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lxo5;

    .line 6
    .line 7
    invoke-virtual {v0}, Lxo5;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lkj4;->B0:Lvo5;

    .line 12
    .line 13
    return-void
.end method

.method public final Y0()J
    .locals 2

    .line 1
    iget-object v0, p0, Lkj4;->D0:Lzi1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljj4;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, p0, v1}, Ljj4;-><init>(Lkj4;B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lrd7;->b(Ldn2;)Lzi1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lkj4;->D0:Lzi1;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lz85;

    .line 22
    .line 23
    iget-wide v0, p0, Lz85;->a:J

    .line 24
    .line 25
    return-wide v0
.end method

.method public final Z0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lkj4;->B0:Lvo5;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lkj4;->A0:Lfi1;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    check-cast v0, Lxo5;

    .line 12
    .line 13
    invoke-virtual {v0}, Lxo5;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-object v4, p0, Lkj4;->F0:Lpf3;

    .line 18
    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-wide v4, v4, Lpf3;->a:J

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-eqz v2, :cond_4

    .line 27
    .line 28
    :goto_1
    iget-object v2, p0, Lkj4;->r0:Lz58;

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Lxo5;->c()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-static {v3, v4}, Lu15;->R(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-interface {v1, v3, v4}, Lfi1;->r(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    iget-object v1, v2, Lz58;->Y:La68;

    .line 45
    .line 46
    sget-object v2, Ly01;->h:Lox1;

    .line 47
    .line 48
    invoke-static {v1, v2}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lfi1;

    .line 53
    .line 54
    invoke-static {v3, v4}, Lnt1;->b(J)F

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-interface {v2, v5}, Lfi1;->x0(F)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v3, v4}, Lnt1;->a(J)F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-interface {v2, v3}, Lfi1;->x0(F)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    int-to-long v3, v5

    .line 71
    const/16 v5, 0x20

    .line 72
    .line 73
    shl-long/2addr v3, v5

    .line 74
    int-to-long v5, v2

    .line 75
    const-wide v7, 0xffffffffL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr v5, v7

    .line 81
    or-long v2, v3, v5

    .line 82
    .line 83
    iget-object v1, v1, La68;->w0:Lrh5;

    .line 84
    .line 85
    new-instance v4, Lpf3;

    .line 86
    .line 87
    invoke-direct {v4, v2, v3}, Lpf3;-><init>(J)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v4}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {v0}, Lxo5;->c()J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    new-instance v2, Lpf3;

    .line 98
    .line 99
    invoke-direct {v2, v0, v1}, Lpf3;-><init>(J)V

    .line 100
    .line 101
    .line 102
    iput-object v2, p0, Lkj4;->F0:Lpf3;

    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method public final e0(Li55;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkj4;->C0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h(Lf17;)V
    .locals 3

    .line 1
    sget-object v0, Llj4;->a:Le17;

    .line 2
    .line 3
    new-instance v1, Ljj4;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Ljj4;-><init>(Lkj4;B)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final q0()V
    .locals 2

    .line 1
    new-instance v0, Ljj4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ljj4;-><init>(Lkj4;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Lch3;->N(Ljx4;Ldn2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final u0(Lp34;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lp34;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkj4;->G0:Lx90;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p1, Ldn8;->a:Ldn8;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
