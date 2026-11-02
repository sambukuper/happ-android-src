.class public final La68;
.super Ly58;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;


# instance fields
.field public s0:Lkd8;

.field public t0:Lr68;

.field public u0:Ly78;

.field public v0:Z

.field public final w0:Lrh5;

.field public final x0:Loi;

.field public final y0:Lkj4;

.field public z0:Log7;


# direct methods
.method public constructor <init>(Lkd8;Lr68;Ly78;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La68;->s0:Lkd8;

    .line 5
    .line 6
    iput-object p2, p0, La68;->t0:Lr68;

    .line 7
    .line 8
    iput-object p3, p0, La68;->u0:Ly78;

    .line 9
    .line 10
    iput-boolean p4, p0, La68;->v0:Z

    .line 11
    .line 12
    new-instance p1, Lpf3;

    .line 13
    .line 14
    const-wide/16 p2, 0x0

    .line 15
    .line 16
    invoke-direct {p1, p2, p3}, Lpf3;-><init>(J)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La68;->w0:Lrh5;

    .line 24
    .line 25
    new-instance p2, Loi;

    .line 26
    .line 27
    iget-object p3, p0, La68;->s0:Lkd8;

    .line 28
    .line 29
    iget-object p4, p0, La68;->t0:Lr68;

    .line 30
    .line 31
    iget-object v0, p0, La68;->u0:Ly78;

    .line 32
    .line 33
    invoke-virtual {p1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lpf3;

    .line 38
    .line 39
    iget-wide v1, p1, Lpf3;->a:J

    .line 40
    .line 41
    invoke-static {p3, p4, v0, v1, v2}, Lbs7;->b(Lkd8;Lr68;Ly78;J)J

    .line 42
    .line 43
    .line 44
    move-result-wide p3

    .line 45
    new-instance p1, Lz85;

    .line 46
    .line 47
    invoke-direct {p1, p3, p4}, Lz85;-><init>(J)V

    .line 48
    .line 49
    .line 50
    sget-object p3, Lo07;->b:Lug8;

    .line 51
    .line 52
    sget-wide v0, Lo07;->c:J

    .line 53
    .line 54
    new-instance p4, Lz85;

    .line 55
    .line 56
    invoke-direct {p4, v0, v1}, Lz85;-><init>(J)V

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x8

    .line 60
    .line 61
    invoke-direct {p2, p1, p3, p4, v0}, Loi;-><init>(Ljava/lang/Object;Lug8;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, La68;->x0:Loi;

    .line 65
    .line 66
    new-instance p1, Lkj4;

    .line 67
    .line 68
    new-instance p2, Lz58;

    .line 69
    .line 70
    const/4 p3, 0x0

    .line 71
    invoke-direct {p2, p0, p3}, Lz58;-><init>(La68;B)V

    .line 72
    .line 73
    .line 74
    new-instance p3, Lz58;

    .line 75
    .line 76
    const/4 p4, 0x1

    .line 77
    invoke-direct {p3, p0, p4}, Lz58;-><init>(La68;B)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, p2, p3}, Lkj4;-><init>(Lz58;Lz58;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, La68;->y0:Lkj4;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final Q0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La68;->c1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b1(Lkd8;Lr68;Ly78;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, La68;->s0:Lkd8;

    .line 2
    .line 3
    iget-object v1, p0, La68;->t0:Lr68;

    .line 4
    .line 5
    iget-object v2, p0, La68;->u0:Ly78;

    .line 6
    .line 7
    iget-boolean v3, p0, La68;->v0:Z

    .line 8
    .line 9
    iput-object p1, p0, La68;->s0:Lkd8;

    .line 10
    .line 11
    iput-object p2, p0, La68;->t0:Lr68;

    .line 12
    .line 13
    iput-object p3, p0, La68;->u0:Ly78;

    .line 14
    .line 15
    iput-boolean p4, p0, La68;->v0:Z

    .line 16
    .line 17
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    if-eq p2, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p3, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    if-eq p4, v3, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void

    .line 36
    :cond_2
    :goto_0
    invoke-virtual {p0}, La68;->c1()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final c1()V
    .locals 6

    .line 1
    iget-object v0, p0, La68;->z0:Log7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, La68;->z0:Log7;

    .line 10
    .line 11
    sget-object v0, Llj4;->a:Le17;

    .line 12
    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v2, 0x1c

    .line 16
    .line 17
    if-lt v0, v2, :cond_2

    .line 18
    .line 19
    iget-boolean v0, p0, La68;->v0:Z

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, La68;->x0:Loi;

    .line 24
    .line 25
    invoke-virtual {v0}, Loi;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lz85;

    .line 30
    .line 31
    iget-wide v2, v0, Lz85;->a:J

    .line 32
    .line 33
    const-wide v4, 0x7fffffff7fffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v2, v4

    .line 39
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long v0, v2, v4

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v2, Lym7;

    .line 53
    .line 54
    const/4 v3, 0x4

    .line 55
    invoke-direct {v2, p0, v1, v3}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 56
    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    sget-object v4, Le71;->f0:Le71;

    .line 60
    .line 61
    invoke-static {v0, v1, v4, v2, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v2, Lt17;

    .line 69
    .line 70
    const/16 v3, 0xe

    .line 71
    .line 72
    invoke-direct {v2, p0, v1, v3}, Lt17;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x3

    .line 76
    invoke-static {v0, v1, v1, v2, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, La68;->z0:Log7;

    .line 81
    .line 82
    :cond_2
    return-void
.end method

.method public final e0(Li55;)V
    .locals 0

    .line 1
    iget-object p0, p0, La68;->y0:Lkj4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkj4;->e0(Li55;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h(Lf17;)V
    .locals 0

    .line 1
    iget-object p0, p0, La68;->y0:Lkj4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkj4;->h(Lf17;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u0(Lp34;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lp34;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La68;->y0:Lkj4;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lkj4;->u0(Lp34;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
