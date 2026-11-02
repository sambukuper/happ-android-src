.class public final Li34;
.super Li55;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final g1:Ldf;


# instance fields
.field public e1:Lg34;

.field public f1:Lh34;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lu15;->c()Ldf;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Ldw0;->h:I

    .line 6
    .line 7
    sget-wide v1, Ldw0;->e:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ldf;->f(J)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ldf;->l(F)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Ldf;->m(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Li34;->g1:Ldf;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;Lg34;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Li55;-><init>(Landroidx/compose/ui/node/LayoutNode;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Li34;->e1:Lg34;

    .line 5
    .line 6
    iget-object p1, p1, Landroidx/compose/ui/node/LayoutNode;->k0:Landroidx/compose/ui/node/LayoutNode;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lh34;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lh34;-><init>(Li34;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    iput-object p1, p0, Li34;->f1:Lh34;

    .line 19
    .line 20
    check-cast p2, Ljx4;

    .line 21
    .line 22
    iget-object p0, p2, Ljx4;->X:Ljx4;

    .line 23
    .line 24
    iget p0, p0, Ljx4;->Z:I

    .line 25
    .line 26
    and-int/lit16 p0, p0, 0x200

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public final K(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li34;->e1:Lg34;

    .line 2
    .line 3
    iget-object v1, p0, Li55;->x0:Li55;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lg34;->y0(Lug3;Ltr4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final Q0()V
    .locals 1

    .line 1
    iget-object v0, p0, Li34;->f1:Lh34;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lh34;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lh34;-><init>(Li34;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Li34;->f1:Lh34;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final S(JFLgn2;)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v4, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Li55;->m1(JFLgn2;Lxt2;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Li34;->w1()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final T(JFLxt2;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-wide v1, p1

    .line 4
    move v3, p3

    .line 5
    move-object v5, p4

    .line 6
    invoke-virtual/range {v0 .. v5}, Li55;->m1(JFLgn2;Lxt2;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Li34;->w1()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final T0()Lxi4;
    .locals 0

    .line 1
    iget-object p0, p0, Li34;->f1:Lh34;

    .line 2
    .line 3
    return-object p0
.end method

.method public final V0()Ljx4;
    .locals 0

    .line 1
    iget-object p0, p0, Li34;->e1:Lg34;

    .line 2
    .line 3
    check-cast p0, Ljx4;

    .line 4
    .line 5
    iget-object p0, p0, Ljx4;->X:Ljx4;

    .line 6
    .line 7
    return-object p0
.end method

.method public final a(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li34;->e1:Lg34;

    .line 2
    .line 3
    iget-object v1, p0, Li55;->x0:Li55;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lg34;->J0(Lug3;Ltr4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final e0(Lr8;)I
    .locals 1

    .line 1
    iget-object v0, p0, Li34;->f1:Lh34;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, v0, Lxi4;->B0:Lf05;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lf05;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lf05;->c:[I

    .line 14
    .line 15
    aget p0, p0, p1

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const/high16 p0, -0x80000000

    .line 19
    .line 20
    return p0

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lkm4;->o(Lvi4;Lr8;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final k(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li34;->e1:Lg34;

    .line 2
    .line 3
    iget-object v1, p0, Li55;->x0:Li55;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lg34;->m0(Lug3;Ltr4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final l1(Lsm0;Lxt2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Li55;->x0:Li55;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Li55;->O0(Lsm0;Lxt2;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Li55;->w0:Landroidx/compose/ui/node/LayoutNode;

    .line 10
    .line 11
    invoke-static {p2}, Lq34;->a(Landroidx/compose/ui/node/LayoutNode;)Lmf5;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2}, Lmf5;->getShowLayoutBounds()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Li55;->x0:Li55;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget-wide v0, p0, Leo5;->Z:J

    .line 26
    .line 27
    iget-wide v2, p2, Leo5;->Z:J

    .line 28
    .line 29
    invoke-static {v0, v1, v2, v3}, Lpf3;->a(JJ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-wide v0, p2, Li55;->H0:J

    .line 36
    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Lhf3;->a(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    :cond_0
    iget-wide v0, p0, Leo5;->Z:J

    .line 46
    .line 47
    const/16 p0, 0x20

    .line 48
    .line 49
    shr-long v2, v0, p0

    .line 50
    .line 51
    long-to-int p0, v2

    .line 52
    int-to-float p0, p0

    .line 53
    const/high16 p2, 0x3f000000    # 0.5f

    .line 54
    .line 55
    sub-float v5, p0, p2

    .line 56
    .line 57
    const-wide v2, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr v0, v2

    .line 63
    long-to-int p0, v0

    .line 64
    int-to-float p0, p0

    .line 65
    sub-float v6, p0, p2

    .line 66
    .line 67
    const/high16 v3, 0x3f000000    # 0.5f

    .line 68
    .line 69
    const/high16 v4, 0x3f000000    # 0.5f

    .line 70
    .line 71
    sget-object v7, Li34;->g1:Ldf;

    .line 72
    .line 73
    move-object v2, p1

    .line 74
    invoke-interface/range {v2 .. v7}, Lsm0;->j(FFFFLdf;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void
.end method

.method public final m(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Li34;->e1:Lg34;

    .line 2
    .line 3
    iget-object v1, p0, Li55;->x0:Li55;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lg34;->i0(Lug3;Ltr4;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final o(J)Leo5;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Leo5;->Z(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li34;->e1:Lg34;

    .line 5
    .line 6
    iget-object v1, p0, Li55;->x0:Li55;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, Lg34;->K(Lzr4;Ltr4;J)Lyr4;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Li55;->p1(Lyr4;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Li55;->g1()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final w1()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lvi4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Li55;->h1()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li55;->x0:Li55;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-boolean v1, v0, Lvi4;->q0:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Lvi4;->q0:Z

    .line 17
    .line 18
    iput-boolean v2, v0, Lvi4;->q0:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Li55;->s0()Lyr4;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Lyr4;->d()V

    .line 25
    .line 26
    .line 27
    iput-boolean v1, v0, Lvi4;->q0:Z

    .line 28
    .line 29
    return-void
.end method

.method public final x1(Lg34;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li34;->e1:Lg34;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Ljx4;

    .line 11
    .line 12
    iget-object v0, v0, Ljx4;->X:Ljx4;

    .line 13
    .line 14
    iget v0, v0, Ljx4;->Z:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iput-object p1, p0, Li34;->e1:Lg34;

    .line 26
    .line 27
    return-void
.end method
