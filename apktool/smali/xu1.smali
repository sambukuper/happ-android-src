.class public abstract Lxu1;
.super Loh1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkq5;
.implements Lic3;
.implements Ls01;
.implements Lhv1;


# instance fields
.field public A0:Lau1;

.field public B0:J

.field public C0:Lor2;

.field public D0:Lor2;

.field public E0:Ldu1;

.field public F0:Lcu1;

.field public G0:Lbu1;

.field public H0:Lwl7;

.field public I0:Lrb8;

.field public J0:Lkr0;

.field public K0:Lhc3;

.field public s0:Lsd5;

.field public t0:Lgn2;

.field public u0:Z

.field public v0:Lxz4;

.field public w0:Lx90;

.field public x0:Lzu1;

.field public y0:Z

.field public z0:Z


# direct methods
.method public constructor <init>(Lgn2;ZLxz4;Lsd5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loh1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lxu1;->s0:Lsd5;

    .line 5
    .line 6
    iput-object p1, p0, Lxu1;->t0:Lgn2;

    .line 7
    .line 8
    iput-boolean p2, p0, Lxu1;->u0:Z

    .line 9
    .line 10
    iput-object p3, p0, Lxu1;->v0:Lxz4;

    .line 11
    .line 12
    const-wide/16 p1, 0x0

    .line 13
    .line 14
    iput-wide p1, p0, Lxu1;->B0:J

    .line 15
    .line 16
    return-void
.end method

.method public static f1(Lxu1;Lhq5;JJI)V
    .locals 3

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    :cond_0
    iget-object p6, p0, Lxu1;->F0:Lcu1;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p6, :cond_1

    .line 11
    .line 12
    new-instance p6, Lcu1;

    .line 13
    .line 14
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p6, Lcu1;->g:Lhq5;

    .line 19
    .line 20
    const-wide v1, 0x7fffffffffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v1, p6, Lcu1;->h:J

    .line 26
    .line 27
    iput-boolean v0, p6, Lcu1;->i:Z

    .line 28
    .line 29
    iput-object p6, p0, Lxu1;->F0:Lcu1;

    .line 30
    .line 31
    :cond_1
    iput-object p1, p6, Lcu1;->g:Lhq5;

    .line 32
    .line 33
    iput-wide p2, p6, Lcu1;->h:J

    .line 34
    .line 35
    iget-object p1, p0, Lxu1;->J0:Lkr0;

    .line 36
    .line 37
    iget-object p2, p0, Lxu1;->s0:Lsd5;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Lkr0;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Lkr0;-><init>(Lsd5;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lxu1;->J0:Lkr0;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-object p2, p1, Lkr0;->c:Ljava/lang/Object;

    .line 50
    .line 51
    iput-wide p4, p1, Lkr0;->b:J

    .line 52
    .line 53
    :goto_0
    iput-boolean v0, p6, Lcu1;->i:Z

    .line 54
    .line 55
    iput-object p6, p0, Lxu1;->H0:Lwl7;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final I()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxu1;->z0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lxu1;->d1()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lxu1;->y0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lxu1;->m1()Ljp0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Leu1;->a:Leu1;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lxu1;->I0:Lrb8;

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lxu1;->z0:Z

    .line 26
    .line 27
    return-void
.end method

.method public final Q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxu1;->u0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object p0, p0, Lxu1;->H0:Lwl7;

    .line 6
    .line 7
    instance-of v0, p0, Lau1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lau1;

    .line 12
    .line 13
    iget-boolean p0, p0, Lau1;->i:Z

    .line 14
    .line 15
    if-eqz p0, :cond_3

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p0, Lcu1;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    instance-of v0, p0, Lbu1;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    :goto_0
    const-string p0, "waiting"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    instance-of p0, p0, Ldu1;

    .line 31
    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    const-string p0, "recognized"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-string p0, "idle"

    .line 38
    .line 39
    return-object p0
.end method

.method public final R0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lxu1;->y0:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lxu1;->b1()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lxu1;->D0:Lor2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Loh1;->Z0(Lnh1;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lxu1;->C0:Lor2;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Loh1;->Z0(Lnh1;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lxu1;->D0:Lor2;

    .line 23
    .line 24
    iput-object v0, p0, Lxu1;->C0:Lor2;

    .line 25
    .line 26
    return-void
.end method

.method public final a0()Lsd5;
    .locals 0

    .line 1
    iget-object p0, p0, Lxu1;->s0:Lsd5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxu1;->x0:Lzu1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lxu1;->v0:Lxz4;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lyu1;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Lyu1;-><init>(Lzu1;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lxz4;->b(Lvf3;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lxu1;->x0:Lzu1;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public abstract c1(Lpi;Lwu1;)Ljava/lang/Object;
.end method

.method public final d1()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lxu1;->B0:J

    .line 4
    .line 5
    iget-object v0, p0, Lxu1;->A0:Lau1;

    .line 6
    .line 7
    sget-object v1, Lzt1;->Z:Lzt1;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lau1;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lau1;->g:Lzt1;

    .line 18
    .line 19
    iput-boolean v2, v0, Lau1;->h:Z

    .line 20
    .line 21
    iput-boolean v2, v0, Lau1;->i:Z

    .line 22
    .line 23
    iput-object v0, p0, Lxu1;->A0:Lau1;

    .line 24
    .line 25
    :cond_0
    iput-object v1, v0, Lau1;->g:Lzt1;

    .line 26
    .line 27
    iput-boolean v2, v0, Lau1;->h:Z

    .line 28
    .line 29
    iput-boolean v2, v0, Lau1;->i:Z

    .line 30
    .line 31
    iput-object v0, p0, Lxu1;->H0:Lwl7;

    .line 32
    .line 33
    return-void
.end method

.method public final e1(Lhq5;JLkr0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxu1;->G0:Lbu1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbu1;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lbu1;->g:Lhq5;

    .line 12
    .line 13
    const-wide v1, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v1, v0, Lbu1;->h:J

    .line 19
    .line 20
    iput-object v0, p0, Lxu1;->G0:Lbu1;

    .line 21
    .line 22
    :cond_0
    iput-object p1, v0, Lbu1;->g:Lhq5;

    .line 23
    .line 24
    iput-wide p2, v0, Lbu1;->h:J

    .line 25
    .line 26
    const-wide/16 p1, 0x0

    .line 27
    .line 28
    iput-wide p1, p4, Lkr0;->b:J

    .line 29
    .line 30
    iput-object v0, p0, Lxu1;->H0:Lwl7;

    .line 31
    .line 32
    return-void
.end method

.method public final g1(Liu1;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lgu1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lxu1;->y0:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lxu1;->y0:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lxu1;->r1()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lxu1;->m1()Ljp0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0, p1}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public h1(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public i1(Lhu1;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ly9;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, p0, p1, v3, v2}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    invoke-static {v0, v3, v3, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final j1(Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Ltu1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ltu1;

    .line 7
    .line 8
    iget v1, v0, Ltu1;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ltu1;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltu1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ltu1;-><init>(Lxu1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ltu1;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ltu1;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lxu1;->x0:Lzu1;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget-object v1, p0, Lxu1;->v0:Lxz4;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    new-instance v4, Lyu1;

    .line 57
    .line 58
    invoke-direct {v4, p1}, Lyu1;-><init>(Lzu1;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Ltu1;->h0:I

    .line 62
    .line 63
    invoke-virtual {v1, v4, v0}, Lxz4;->a(Lvf3;Lq51;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Lc71;->X:Lc71;

    .line 68
    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    :goto_1
    iput-object v2, p0, Lxu1;->x0:Lzu1;

    .line 73
    .line 74
    :cond_4
    new-instance p1, Lhu1;

    .line 75
    .line 76
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {p1, v0, v1, v2}, Lhu1;-><init>(JZ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lxu1;->i1(Lhu1;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Ldn8;->a:Ldn8;

    .line 86
    .line 87
    return-object p0
.end method

.method public final k1(Lgu1;Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Luu1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Luu1;

    .line 7
    .line 8
    iget v1, v0, Luu1;->j0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Luu1;->j0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Luu1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Luu1;-><init>(Lxu1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Luu1;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Luu1;->j0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lc71;->X:Lc71;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Luu1;->g0:Lzu1;

    .line 40
    .line 41
    iget-object v0, v0, Luu1;->f0:Lgu1;

    .line 42
    .line 43
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, Luu1;->f0:Lgu1;

    .line 55
    .line 56
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lxu1;->x0:Lzu1;

    .line 64
    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lxu1;->v0:Lxz4;

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    new-instance v5, Lyu1;

    .line 72
    .line 73
    invoke-direct {v5, p2}, Lyu1;-><init>(Lzu1;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Luu1;->f0:Lgu1;

    .line 77
    .line 78
    iput v3, v0, Luu1;->j0:I

    .line 79
    .line 80
    invoke-virtual {v1, v5, v0}, Lxz4;->a(Lvf3;Lq51;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_1
    new-instance p2, Lzu1;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, Lxu1;->v0:Lxz4;

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    iput-object p1, v0, Luu1;->f0:Lgu1;

    .line 97
    .line 98
    iput-object p2, v0, Luu1;->g0:Lzu1;

    .line 99
    .line 100
    iput v2, v0, Luu1;->j0:I

    .line 101
    .line 102
    invoke-virtual {v1, p2, v0}, Lxz4;->a(Lvf3;Lq51;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v4, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v4

    .line 109
    :cond_5
    move-object v0, p1

    .line 110
    move-object p1, p2

    .line 111
    :goto_3
    move-object p2, p1

    .line 112
    move-object p1, v0

    .line 113
    :cond_6
    iput-object p2, p0, Lxu1;->x0:Lzu1;

    .line 114
    .line 115
    iget-wide p1, p1, Lgu1;->a:J

    .line 116
    .line 117
    invoke-virtual {p0, p1, p2}, Lxu1;->h1(J)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Ldn8;->a:Ldn8;

    .line 121
    .line 122
    return-object p0
.end method

.method public final l0()V
    .locals 2

    .line 1
    iget-object p0, p0, Lxu1;->K0:Lhc3;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lhc3;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lhc3;->X:Lxu1;

    .line 9
    .line 10
    iget-boolean v1, v0, Lxu1;->y0:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v1, Leu1;->a:Leu1;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lxu1;->g1(Liu1;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lhc3;->i0:Lrb8;

    .line 21
    .line 22
    iget-object p0, p0, Lhc3;->l0:Lb8;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Lb8;->b:I

    .line 26
    .line 27
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lzz4;

    .line 30
    .line 31
    iput v0, p0, Lzz4;->b:I

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final l1(Lhu1;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lvu1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lvu1;

    .line 7
    .line 8
    iget v1, v0, Lvu1;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lvu1;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvu1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lvu1;-><init>(Lxu1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lvu1;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvu1;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p1, v0, Lvu1;->f0:Lhu1;

    .line 36
    .line 37
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lxu1;->x0:Lzu1;

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    iget-object v1, p0, Lxu1;->v0:Lxz4;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    new-instance v4, Lav1;

    .line 59
    .line 60
    invoke-direct {v4, p2}, Lav1;-><init>(Lzu1;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v0, Lvu1;->f0:Lhu1;

    .line 64
    .line 65
    iput v3, v0, Lvu1;->i0:I

    .line 66
    .line 67
    invoke-virtual {v1, v4, v0}, Lxz4;->a(Lvf3;Lq51;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v0, Lc71;->X:Lc71;

    .line 72
    .line 73
    if-ne p2, v0, :cond_3

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_1
    iput-object v2, p0, Lxu1;->x0:Lzu1;

    .line 77
    .line 78
    :cond_4
    invoke-virtual {p0, p1}, Lxu1;->i1(Lhu1;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Ldn8;->a:Ldn8;

    .line 82
    .line 83
    return-object p0
.end method

.method public final m1()Ljp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lxu1;->w0:Lx90;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Events channel not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final n1()Lrb8;
    .locals 0

    .line 1
    iget-object p0, p0, Lxu1;->I0:Lrb8;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Velocity Tracker not initialized."

    .line 7
    .line 8
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final o1(JLhq5;)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lxu1;->B0:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lz85;->f(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lxu1;->B0:J

    .line 8
    .line 9
    invoke-virtual {p0}, Lxu1;->n1()Lrb8;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p3}, Lp38;->a(Lrb8;Lhq5;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lxu1;->m1()Ljp0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p3, Lfu1;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p3, p1, p2, v0}, Lfu1;-><init>(JZ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, p3}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final p1(Lhq5;Lhq5;J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxu1;->I0:Lrb8;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lrb8;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lrb8;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxu1;->I0:Lrb8;

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lxu1;->n1()Lrb8;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p1}, Lp38;->a(Lrb8;Lhq5;)V

    .line 18
    .line 19
    .line 20
    iget-wide v2, p2, Lhq5;->c:J

    .line 21
    .line 22
    invoke-static {v2, v3, p3, p4}, Lz85;->e(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p2

    .line 26
    iget-object p4, p0, Lxu1;->t0:Lgn2;

    .line 27
    .line 28
    iget p1, p1, Lhq5;->i:I

    .line 29
    .line 30
    new-instance v0, Loq5;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Loq5;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p4, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    iget-boolean p1, p0, Lxu1;->y0:Z

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, Lxu1;->w0:Lx90;

    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    const p1, 0x7fffffff

    .line 56
    .line 57
    .line 58
    const/4 p4, 0x0

    .line 59
    invoke-static {p1, p4, p4, v1}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lxu1;->w0:Lx90;

    .line 64
    .line 65
    :cond_1
    invoke-virtual {p0}, Lxu1;->r1()V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p0}, Lxu1;->m1()Ljp0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance p1, Lgu1;

    .line 73
    .line 74
    invoke-direct {p1, p2, p3}, Lgu1;-><init>(J)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p0, p1}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public q1()Z
    .locals 1

    .line 1
    check-cast p0, Lmy6;

    .line 2
    .line 3
    iget-object p0, p0, Lmy6;->T0:Lsy6;

    .line 4
    .line 5
    iget-object v0, p0, Lsy6;->a:Lny6;

    .line 6
    .line 7
    invoke-interface {v0}, Lny6;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, Lsy6;->b:Ltd;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ltd;->e()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p0, v0

    .line 24
    :goto_0
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return v0

    .line 28
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public final r1()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lxu1;->y0:Z

    .line 3
    .line 4
    iget-object v0, p0, Lxu1;->w0:Lx90;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-static {v0, v1, v1, v2}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lxu1;->w0:Lx90;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Lwu1;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v2, p0, v1, v3}, Lwu1;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x3

    .line 30
    invoke-static {v0, v1, v1, v2, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final s1(Lgn2;ZLxz4;Lsd5;Z)V
    .locals 2

    .line 1
    iput-object p1, p0, Lxu1;->t0:Lgn2;

    .line 2
    .line 3
    iget-boolean p1, p0, Lxu1;->u0:Z

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq p1, p2, :cond_3

    .line 8
    .line 9
    iput-boolean p2, p0, Lxu1;->u0:Z

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    iget-object p1, p0, Lxu1;->D0:Lor2;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Loh1;->Z0(Lnh1;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lxu1;->C0:Lor2;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Loh1;->Z0(Lnh1;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object v0, p0, Lxu1;->D0:Lor2;

    .line 28
    .line 29
    iput-object v0, p0, Lxu1;->C0:Lor2;

    .line 30
    .line 31
    invoke-virtual {p0}, Lxu1;->b1()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lxu1;->K0:Lhc3;

    .line 35
    .line 36
    :cond_2
    move p5, v1

    .line 37
    :cond_3
    iget-object p1, p0, Lxu1;->v0:Lxz4;

    .line 38
    .line 39
    invoke-static {p1, p3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Lxu1;->b1()V

    .line 46
    .line 47
    .line 48
    iput-object p3, p0, Lxu1;->v0:Lxz4;

    .line 49
    .line 50
    :cond_4
    iget-object p1, p0, Lxu1;->s0:Lsd5;

    .line 51
    .line 52
    if-eq p1, p4, :cond_5

    .line 53
    .line 54
    iput-object p4, p0, Lxu1;->s0:Lsd5;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    move v1, p5

    .line 58
    :goto_0
    if-eqz v1, :cond_9

    .line 59
    .line 60
    iget-boolean p1, p0, Lxu1;->z0:Z

    .line 61
    .line 62
    sget-object p2, Leu1;->a:Leu1;

    .line 63
    .line 64
    if-eqz p1, :cond_7

    .line 65
    .line 66
    invoke-virtual {p0}, Lxu1;->d1()V

    .line 67
    .line 68
    .line 69
    iget-boolean p1, p0, Lxu1;->y0:Z

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0}, Lxu1;->m1()Ljp0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p1, p2}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_6
    iput-object v0, p0, Lxu1;->I0:Lrb8;

    .line 81
    .line 82
    :cond_7
    iget-object p0, p0, Lxu1;->K0:Lhc3;

    .line 83
    .line 84
    if-eqz p0, :cond_9

    .line 85
    .line 86
    invoke-virtual {p0}, Lhc3;->a()V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lhc3;->X:Lxu1;

    .line 90
    .line 91
    iget-boolean p3, p1, Lxu1;->y0:Z

    .line 92
    .line 93
    if-eqz p3, :cond_8

    .line 94
    .line 95
    invoke-virtual {p1, p2}, Lxu1;->g1(Liu1;)V

    .line 96
    .line 97
    .line 98
    :cond_8
    iput-object v0, p0, Lhc3;->i0:Lrb8;

    .line 99
    .line 100
    iget-object p0, p0, Lhc3;->l0:Lb8;

    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    iput p1, p0, Lb8;->b:I

    .line 104
    .line 105
    iget-object p0, p0, Lb8;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lzz4;

    .line 108
    .line 109
    iput p1, p0, Lzz4;->b:I

    .line 110
    .line 111
    :cond_9
    return-void
.end method

.method public final w(Lne;Lbq5;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, Lne;->b:I

    .line 8
    .line 9
    iget-object v1, v1, Lne;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-boolean v4, v0, Lxu1;->u0:Z

    .line 14
    .line 15
    if-eqz v4, :cond_42

    .line 16
    .line 17
    iget-object v4, v0, Lxu1;->K0:Lhc3;

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    new-instance v4, Lhc3;

    .line 22
    .line 23
    invoke-direct {v4, v0}, Lhc3;-><init>(Lxu1;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, v0, Lxu1;->K0:Lhc3;

    .line 27
    .line 28
    :cond_0
    iget-object v5, v0, Lxu1;->D0:Lor2;

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    new-instance v5, Lor2;

    .line 33
    .line 34
    invoke-direct {v5, v4}, Lor2;-><init>(Lnr2;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v5}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 38
    .line 39
    .line 40
    iput-object v5, v0, Lxu1;->D0:Lor2;

    .line 41
    .line 42
    :cond_1
    iget-object v6, v0, Lxu1;->K0:Lhc3;

    .line 43
    .line 44
    if-eqz v6, :cond_42

    .line 45
    .line 46
    iget-object v0, v6, Lhc3;->X:Lxu1;

    .line 47
    .line 48
    iget-object v4, v6, Lhc3;->h0:Lw51;

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    iget-object v4, v6, Lhc3;->Y:Lcc3;

    .line 54
    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    new-instance v4, Lcc3;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object v7, Lbc3;->Z:Lbc3;

    .line 63
    .line 64
    iput-object v7, v4, Lcc3;->q:Lbc3;

    .line 65
    .line 66
    iput-boolean v5, v4, Lcc3;->r:Z

    .line 67
    .line 68
    iput-boolean v5, v4, Lcc3;->s:Z

    .line 69
    .line 70
    iput-object v4, v6, Lhc3;->Y:Lcc3;

    .line 71
    .line 72
    :cond_2
    iput-object v4, v6, Lhc3;->h0:Lw51;

    .line 73
    .line 74
    :cond_3
    instance-of v7, v4, Lcc3;

    .line 75
    .line 76
    const-wide v12, 0x7fffffffffffffffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide/16 v14, 0x0

    .line 82
    .line 83
    sget-object v8, Lbq5;->X:Lbq5;

    .line 84
    .line 85
    const/4 v9, 0x1

    .line 86
    sget-object v10, Lbq5;->Y:Lbq5;

    .line 87
    .line 88
    if-eqz v7, :cond_d

    .line 89
    .line 90
    check-cast v4, Lcc3;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_4

    .line 97
    .line 98
    goto/16 :goto_19

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    :goto_0
    if-ge v5, v7, :cond_6

    .line 105
    .line 106
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    check-cast v11, Lac3;

    .line 111
    .line 112
    invoke-static {v11}, Lz51;->o(Lac3;)Z

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-nez v11, :cond_5

    .line 117
    .line 118
    goto/16 :goto_19

    .line 119
    .line 120
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_6
    invoke-static {v1}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    move-object v7, v1

    .line 128
    check-cast v7, Lac3;

    .line 129
    .line 130
    iget-object v1, v4, Lcc3;->q:Lbc3;

    .line 131
    .line 132
    sget-object v5, Lgc3;->a:[I

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    aget v1, v5, v1

    .line 139
    .line 140
    sget-object v5, Lbc3;->Y:Lbc3;

    .line 141
    .line 142
    sget-object v11, Lbc3;->X:Lbc3;

    .line 143
    .line 144
    if-ne v1, v9, :cond_8

    .line 145
    .line 146
    invoke-virtual {v0}, Lxu1;->q1()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_7

    .line 151
    .line 152
    move-object v0, v11

    .line 153
    goto :goto_1

    .line 154
    :cond_7
    move-object v0, v5

    .line 155
    goto :goto_1

    .line 156
    :cond_8
    iget-object v0, v4, Lcc3;->q:Lbc3;

    .line 157
    .line 158
    :goto_1
    iput-object v0, v4, Lcc3;->q:Lbc3;

    .line 159
    .line 160
    if-ne v2, v8, :cond_a

    .line 161
    .line 162
    if-ne v0, v5, :cond_9

    .line 163
    .line 164
    iput-boolean v9, v7, Lac3;->i:Z

    .line 165
    .line 166
    iput-boolean v9, v4, Lcc3;->r:Z

    .line 167
    .line 168
    :cond_9
    iput-boolean v9, v4, Lcc3;->s:Z

    .line 169
    .line 170
    :cond_a
    if-ne v2, v10, :cond_42

    .line 171
    .line 172
    if-ne v0, v11, :cond_b

    .line 173
    .line 174
    iget-wide v8, v7, Lac3;->a:J

    .line 175
    .line 176
    const-wide/16 v10, 0x0

    .line 177
    .line 178
    const/16 v12, 0xc

    .line 179
    .line 180
    invoke-static/range {v6 .. v12}, Lhc3;->c(Lhc3;Lac3;JJI)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_b
    iget-boolean v0, v4, Lcc3;->r:Z

    .line 185
    .line 186
    if-eqz v0, :cond_42

    .line 187
    .line 188
    new-instance v9, Lzb3;

    .line 189
    .line 190
    invoke-direct {v9, v3}, Lzb3;-><init>(I)V

    .line 191
    .line 192
    .line 193
    const-wide/16 v10, 0x0

    .line 194
    .line 195
    move-object v8, v7

    .line 196
    invoke-virtual/range {v6 .. v11}, Lhc3;->f(Lac3;Lac3;Lzb3;J)V

    .line 197
    .line 198
    .line 199
    new-instance v0, Lzb3;

    .line 200
    .line 201
    invoke-direct {v0, v3}, Lzb3;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v7, v0, v14, v15}, Lhc3;->e(Lac3;Lzb3;J)V

    .line 205
    .line 206
    .line 207
    iget-wide v0, v7, Lac3;->a:J

    .line 208
    .line 209
    iget-object v2, v6, Lhc3;->Z:Lfc3;

    .line 210
    .line 211
    if-nez v2, :cond_c

    .line 212
    .line 213
    new-instance v2, Lfc3;

    .line 214
    .line 215
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 216
    .line 217
    .line 218
    iput-wide v12, v2, Lfc3;->q:J

    .line 219
    .line 220
    iput-object v2, v6, Lhc3;->Z:Lfc3;

    .line 221
    .line 222
    :cond_c
    iput-wide v0, v2, Lfc3;->q:J

    .line 223
    .line 224
    iput-object v2, v6, Lhc3;->h0:Lw51;

    .line 225
    .line 226
    return-void

    .line 227
    :cond_d
    instance-of v7, v4, Lec3;

    .line 228
    .line 229
    sget-object v11, Lbq5;->Z:Lbq5;

    .line 230
    .line 231
    if-eqz v7, :cond_23

    .line 232
    .line 233
    check-cast v4, Lec3;

    .line 234
    .line 235
    if-ne v2, v8, :cond_e

    .line 236
    .line 237
    goto/16 :goto_19

    .line 238
    .line 239
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    move v8, v5

    .line 244
    :goto_2
    if-ge v8, v7, :cond_10

    .line 245
    .line 246
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    move-object v14, v15

    .line 251
    check-cast v14, Lac3;

    .line 252
    .line 253
    iget-wide v12, v14, Lac3;->a:J

    .line 254
    .line 255
    move-object v14, v6

    .line 256
    iget-wide v5, v4, Lec3;->r:J

    .line 257
    .line 258
    invoke-static {v12, v13, v5, v6}, Ljm4;->w(JJ)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-eqz v5, :cond_f

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 266
    .line 267
    move-object v6, v14

    .line 268
    const/4 v5, 0x0

    .line 269
    const-wide v12, 0x7fffffffffffffffL

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_10
    move-object v14, v6

    .line 276
    const/4 v15, 0x0

    .line 277
    :goto_3
    check-cast v15, Lac3;

    .line 278
    .line 279
    if-nez v15, :cond_14

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    const/4 v6, 0x0

    .line 286
    :goto_4
    if-ge v6, v5, :cond_12

    .line 287
    .line 288
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    move-object v8, v7

    .line 293
    check-cast v8, Lac3;

    .line 294
    .line 295
    iget-boolean v8, v8, Lac3;->d:Z

    .line 296
    .line 297
    if-eqz v8, :cond_11

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_12
    const/4 v7, 0x0

    .line 304
    :goto_5
    move-object v15, v7

    .line 305
    check-cast v15, Lac3;

    .line 306
    .line 307
    if-nez v15, :cond_13

    .line 308
    .line 309
    invoke-virtual {v14}, Lhc3;->a()V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_13
    iget-wide v5, v15, Lac3;->a:J

    .line 314
    .line 315
    iput-wide v5, v4, Lec3;->r:J

    .line 316
    .line 317
    :cond_14
    move-object v8, v15

    .line 318
    const-string v5, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 319
    .line 320
    const-string v12, "AwaitTouchSlop.initialDown was not initialized"

    .line 321
    .line 322
    if-ne v2, v10, :cond_17

    .line 323
    .line 324
    iget-boolean v6, v8, Lac3;->i:Z

    .line 325
    .line 326
    if-nez v6, :cond_1d

    .line 327
    .line 328
    invoke-static {v8}, Lz51;->p(Lac3;)Z

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-eqz v6, :cond_19

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    const/4 v3, 0x0

    .line 339
    :goto_6
    if-ge v3, v0, :cond_16

    .line 340
    .line 341
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    move-object v7, v6

    .line 346
    check-cast v7, Lac3;

    .line 347
    .line 348
    iget-boolean v7, v7, Lac3;->d:Z

    .line 349
    .line 350
    if-eqz v7, :cond_15

    .line 351
    .line 352
    move-object/from16 v16, v6

    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_16
    const/16 v16, 0x0

    .line 359
    .line 360
    :goto_7
    move-object/from16 v0, v16

    .line 361
    .line 362
    check-cast v0, Lac3;

    .line 363
    .line 364
    if-nez v0, :cond_18

    .line 365
    .line 366
    invoke-virtual {v14}, Lhc3;->a()V

    .line 367
    .line 368
    .line 369
    :cond_17
    :goto_8
    move-object v13, v11

    .line 370
    move-object v6, v14

    .line 371
    goto/16 :goto_9

    .line 372
    .line 373
    :cond_18
    iget-wide v0, v0, Lac3;->a:J

    .line 374
    .line 375
    iput-wide v0, v4, Lec3;->r:J

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_19
    sget-object v1, Ly01;->t:Lox1;

    .line 379
    .line 380
    invoke-static {v0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    check-cast v1, Lfw8;

    .line 385
    .line 386
    sget v6, Lqu1;->a:F

    .line 387
    .line 388
    invoke-interface {v1}, Lfw8;->f()F

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    move-object v6, v14

    .line 393
    iget-object v7, v6, Lhc3;->j0:Lkr0;

    .line 394
    .line 395
    if-eqz v7, :cond_1c

    .line 396
    .line 397
    iget-object v0, v0, Lxu1;->s0:Lsd5;

    .line 398
    .line 399
    new-instance v10, Lzb3;

    .line 400
    .line 401
    invoke-direct {v10, v3}, Lzb3;-><init>(I)V

    .line 402
    .line 403
    .line 404
    invoke-static {v8, v0, v10, v9}, Lz51;->M(Lac3;Lsd5;Lzb3;Z)J

    .line 405
    .line 406
    .line 407
    move-result-wide v13

    .line 408
    invoke-static {v7, v13, v14, v1}, Lkr0;->e(Lkr0;JF)J

    .line 409
    .line 410
    .line 411
    move-result-wide v0

    .line 412
    const-wide v13, 0x7fffffff7fffffffL

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    and-long/2addr v13, v0

    .line 418
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    cmp-long v7, v13, v15

    .line 424
    .line 425
    if-eqz v7, :cond_1b

    .line 426
    .line 427
    iput-boolean v9, v8, Lac3;->i:Z

    .line 428
    .line 429
    iget-object v7, v4, Lec3;->q:Lac3;

    .line 430
    .line 431
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    new-instance v9, Lzb3;

    .line 435
    .line 436
    invoke-direct {v9, v3}, Lzb3;-><init>(I)V

    .line 437
    .line 438
    .line 439
    move-object v13, v11

    .line 440
    move-wide v10, v0

    .line 441
    invoke-virtual/range {v6 .. v11}, Lhc3;->f(Lac3;Lac3;Lzb3;J)V

    .line 442
    .line 443
    .line 444
    new-instance v0, Lzb3;

    .line 445
    .line 446
    invoke-direct {v0, v3}, Lzb3;-><init>(I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v6, v8, v0, v10, v11}, Lhc3;->e(Lac3;Lzb3;J)V

    .line 450
    .line 451
    .line 452
    iget-wide v0, v8, Lac3;->a:J

    .line 453
    .line 454
    iget-object v3, v6, Lhc3;->Z:Lfc3;

    .line 455
    .line 456
    if-nez v3, :cond_1a

    .line 457
    .line 458
    new-instance v3, Lfc3;

    .line 459
    .line 460
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 461
    .line 462
    .line 463
    const-wide v9, 0x7fffffffffffffffL

    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    iput-wide v9, v3, Lfc3;->q:J

    .line 469
    .line 470
    iput-object v3, v6, Lhc3;->Z:Lfc3;

    .line 471
    .line 472
    :cond_1a
    iput-wide v0, v3, Lfc3;->q:J

    .line 473
    .line 474
    iput-object v3, v6, Lhc3;->h0:Lw51;

    .line 475
    .line 476
    goto :goto_9

    .line 477
    :cond_1b
    move-object v13, v11

    .line 478
    iput-boolean v9, v4, Lec3;->s:Z

    .line 479
    .line 480
    goto :goto_9

    .line 481
    :cond_1c
    const-string v0, "Touch slop detector not initialized."

    .line 482
    .line 483
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :cond_1d
    move-object v13, v11

    .line 488
    move-object v6, v14

    .line 489
    iget-object v0, v4, Lec3;->q:Lac3;

    .line 490
    .line 491
    if-eqz v0, :cond_1f

    .line 492
    .line 493
    iget-wide v9, v4, Lec3;->r:J

    .line 494
    .line 495
    iget-object v1, v6, Lhc3;->j0:Lkr0;

    .line 496
    .line 497
    if-eqz v1, :cond_1e

    .line 498
    .line 499
    invoke-virtual {v6, v0, v9, v10, v1}, Lhc3;->b(Lac3;JLkr0;)V

    .line 500
    .line 501
    .line 502
    goto :goto_9

    .line 503
    :cond_1e
    invoke-static {v5}, Lbt;->q(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    return-void

    .line 507
    :cond_1f
    invoke-static {v12}, Lbt;->q(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :goto_9
    if-ne v2, v13, :cond_42

    .line 512
    .line 513
    iget-boolean v0, v4, Lec3;->s:Z

    .line 514
    .line 515
    if-eqz v0, :cond_42

    .line 516
    .line 517
    iget-boolean v0, v8, Lac3;->i:Z

    .line 518
    .line 519
    if-eqz v0, :cond_22

    .line 520
    .line 521
    iget-object v0, v4, Lec3;->q:Lac3;

    .line 522
    .line 523
    if-eqz v0, :cond_21

    .line 524
    .line 525
    iget-wide v1, v4, Lec3;->r:J

    .line 526
    .line 527
    iget-object v3, v6, Lhc3;->j0:Lkr0;

    .line 528
    .line 529
    if-eqz v3, :cond_20

    .line 530
    .line 531
    invoke-virtual {v6, v0, v1, v2, v3}, Lhc3;->b(Lac3;JLkr0;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :cond_20
    invoke-static {v5}, Lbt;->q(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :cond_21
    invoke-static {v12}, Lbt;->q(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :cond_22
    const/4 v0, 0x0

    .line 544
    iput-boolean v0, v4, Lec3;->s:Z

    .line 545
    .line 546
    return-void

    .line 547
    :cond_23
    move-object v13, v11

    .line 548
    instance-of v5, v4, Ldc3;

    .line 549
    .line 550
    if-eqz v5, :cond_2b

    .line 551
    .line 552
    check-cast v4, Ldc3;

    .line 553
    .line 554
    if-eq v2, v13, :cond_24

    .line 555
    .line 556
    goto/16 :goto_19

    .line 557
    .line 558
    :cond_24
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    const/4 v5, 0x0

    .line 563
    :goto_a
    if-ge v5, v2, :cond_26

    .line 564
    .line 565
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    check-cast v7, Lac3;

    .line 570
    .line 571
    iget-boolean v7, v7, Lac3;->i:Z

    .line 572
    .line 573
    if-eqz v7, :cond_25

    .line 574
    .line 575
    const/4 v9, 0x0

    .line 576
    goto :goto_b

    .line 577
    :cond_25
    add-int/lit8 v5, v5, 0x1

    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_26
    :goto_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    const/4 v5, 0x0

    .line 585
    :goto_c
    if-ge v5, v2, :cond_2a

    .line 586
    .line 587
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v7

    .line 591
    check-cast v7, Lac3;

    .line 592
    .line 593
    iget-boolean v7, v7, Lac3;->d:Z

    .line 594
    .line 595
    if-eqz v7, :cond_29

    .line 596
    .line 597
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    if-eqz v2, :cond_27

    .line 602
    .line 603
    goto :goto_d

    .line 604
    :cond_27
    if-eqz v9, :cond_42

    .line 605
    .line 606
    invoke-static {v1}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    check-cast v1, Lac3;

    .line 611
    .line 612
    iget-object v2, v0, Lxu1;->s0:Lsd5;

    .line 613
    .line 614
    new-instance v5, Lzb3;

    .line 615
    .line 616
    invoke-direct {v5, v3}, Lzb3;-><init>(I)V

    .line 617
    .line 618
    .line 619
    invoke-static {v1, v2, v5}, Lz51;->N(Lac3;Lsd5;Lzb3;)J

    .line 620
    .line 621
    .line 622
    move-result-wide v1

    .line 623
    iget-object v5, v4, Ldc3;->q:Lac3;

    .line 624
    .line 625
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    iget-object v0, v0, Lxu1;->s0:Lsd5;

    .line 629
    .line 630
    new-instance v7, Lzb3;

    .line 631
    .line 632
    invoke-direct {v7, v3}, Lzb3;-><init>(I)V

    .line 633
    .line 634
    .line 635
    invoke-static {v5, v0, v7}, Lz51;->N(Lac3;Lsd5;Lzb3;)J

    .line 636
    .line 637
    .line 638
    move-result-wide v7

    .line 639
    invoke-static {v1, v2, v7, v8}, Lz85;->e(JJ)J

    .line 640
    .line 641
    .line 642
    move-result-wide v10

    .line 643
    iget-object v7, v4, Ldc3;->q:Lac3;

    .line 644
    .line 645
    if-eqz v7, :cond_28

    .line 646
    .line 647
    iget-wide v8, v4, Ldc3;->r:J

    .line 648
    .line 649
    const/16 v12, 0x8

    .line 650
    .line 651
    invoke-static/range {v6 .. v12}, Lhc3;->c(Lhc3;Lac3;JJI)V

    .line 652
    .line 653
    .line 654
    return-void

    .line 655
    :cond_28
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 656
    .line 657
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    return-void

    .line 661
    :cond_29
    add-int/lit8 v5, v5, 0x1

    .line 662
    .line 663
    goto :goto_c

    .line 664
    :cond_2a
    :goto_d
    invoke-virtual {v6}, Lhc3;->a()V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :cond_2b
    instance-of v5, v4, Lfc3;

    .line 669
    .line 670
    if-eqz v5, :cond_41

    .line 671
    .line 672
    check-cast v4, Lfc3;

    .line 673
    .line 674
    if-eq v2, v10, :cond_2c

    .line 675
    .line 676
    goto/16 :goto_19

    .line 677
    .line 678
    :cond_2c
    iget-wide v7, v4, Lfc3;->q:J

    .line 679
    .line 680
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    const/4 v5, 0x0

    .line 685
    :goto_e
    if-ge v5, v2, :cond_2e

    .line 686
    .line 687
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v10

    .line 691
    move-object v11, v10

    .line 692
    check-cast v11, Lac3;

    .line 693
    .line 694
    iget-wide v11, v11, Lac3;->a:J

    .line 695
    .line 696
    invoke-static {v11, v12, v7, v8}, Ljm4;->w(JJ)Z

    .line 697
    .line 698
    .line 699
    move-result v11

    .line 700
    if-eqz v11, :cond_2d

    .line 701
    .line 702
    goto :goto_f

    .line 703
    :cond_2d
    add-int/lit8 v5, v5, 0x1

    .line 704
    .line 705
    goto :goto_e

    .line 706
    :cond_2e
    const/4 v10, 0x0

    .line 707
    :goto_f
    check-cast v10, Lac3;

    .line 708
    .line 709
    if-nez v10, :cond_2f

    .line 710
    .line 711
    goto/16 :goto_19

    .line 712
    .line 713
    :cond_2f
    iget-wide v7, v10, Lac3;->c:J

    .line 714
    .line 715
    invoke-static {v10}, Lz51;->p(Lac3;)Z

    .line 716
    .line 717
    .line 718
    move-result v2

    .line 719
    sget-object v5, Leu1;->a:Leu1;

    .line 720
    .line 721
    if-eqz v2, :cond_3e

    .line 722
    .line 723
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 724
    .line 725
    .line 726
    move-result v2

    .line 727
    const/4 v12, 0x0

    .line 728
    :goto_10
    if-ge v12, v2, :cond_31

    .line 729
    .line 730
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v13

    .line 734
    move-object v14, v13

    .line 735
    check-cast v14, Lac3;

    .line 736
    .line 737
    iget-boolean v14, v14, Lac3;->d:Z

    .line 738
    .line 739
    if-eqz v14, :cond_30

    .line 740
    .line 741
    goto :goto_11

    .line 742
    :cond_30
    add-int/lit8 v12, v12, 0x1

    .line 743
    .line 744
    goto :goto_10

    .line 745
    :cond_31
    const/4 v13, 0x0

    .line 746
    :goto_11
    check-cast v13, Lac3;

    .line 747
    .line 748
    if-nez v13, :cond_3d

    .line 749
    .line 750
    iget-boolean v1, v10, Lac3;->i:Z

    .line 751
    .line 752
    if-nez v1, :cond_3c

    .line 753
    .line 754
    invoke-static {v10}, Lz51;->p(Lac3;)Z

    .line 755
    .line 756
    .line 757
    move-result v1

    .line 758
    if-eqz v1, :cond_3c

    .line 759
    .line 760
    invoke-virtual {v6}, Lhc3;->d()Lrb8;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    iget-object v2, v0, Lxu1;->s0:Lsd5;

    .line 765
    .line 766
    iget-object v4, v6, Lhc3;->k0:Lb8;

    .line 767
    .line 768
    iget-object v5, v4, Lb8;->c:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v5, Lj05;

    .line 771
    .line 772
    const/16 v12, 0x20

    .line 773
    .line 774
    shr-long v13, v7, v12

    .line 775
    .line 776
    long-to-int v13, v13

    .line 777
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 778
    .line 779
    .line 780
    move-result v13

    .line 781
    const-wide v14, 0xffffffffL

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    and-long/2addr v7, v14

    .line 787
    long-to-int v7, v7

    .line 788
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 789
    .line 790
    .line 791
    move-result v7

    .line 792
    invoke-static {v10}, Lz51;->o(Lac3;)Z

    .line 793
    .line 794
    .line 795
    move-result v8

    .line 796
    if-eqz v8, :cond_32

    .line 797
    .line 798
    const/4 v8, 0x0

    .line 799
    iput v8, v4, Lb8;->b:I

    .line 800
    .line 801
    invoke-virtual {v5}, Lj05;->d()V

    .line 802
    .line 803
    .line 804
    :cond_32
    invoke-static {v10}, Lz51;->p(Lac3;)Z

    .line 805
    .line 806
    .line 807
    move-result v8

    .line 808
    if-nez v8, :cond_37

    .line 809
    .line 810
    invoke-static {v10}, Lz51;->o(Lac3;)Z

    .line 811
    .line 812
    .line 813
    move-result v8

    .line 814
    if-nez v8, :cond_37

    .line 815
    .line 816
    iget v7, v5, Lj05;->b:I

    .line 817
    .line 818
    const/4 v8, 0x3

    .line 819
    if-ne v7, v8, :cond_33

    .line 820
    .line 821
    iget v7, v4, Lb8;->b:I

    .line 822
    .line 823
    add-int/lit8 v13, v7, 0x1

    .line 824
    .line 825
    iput v13, v4, Lb8;->b:I

    .line 826
    .line 827
    invoke-virtual {v5, v7, v10}, Lj05;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    goto :goto_12

    .line 831
    :cond_33
    invoke-virtual {v5, v10}, Lj05;->a(Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    :goto_12
    iget v7, v4, Lb8;->b:I

    .line 835
    .line 836
    if-ne v7, v8, :cond_34

    .line 837
    .line 838
    const/4 v8, 0x0

    .line 839
    iput v8, v4, Lb8;->b:I

    .line 840
    .line 841
    :cond_34
    iget-object v4, v5, Lj05;->a:[Ljava/lang/Object;

    .line 842
    .line 843
    iget v7, v5, Lj05;->b:I

    .line 844
    .line 845
    const/4 v8, 0x0

    .line 846
    const/4 v13, 0x0

    .line 847
    :goto_13
    if-ge v8, v7, :cond_35

    .line 848
    .line 849
    aget-object v17, v4, v8

    .line 850
    .line 851
    const/16 p2, 0x0

    .line 852
    .line 853
    move-object/from16 v11, v17

    .line 854
    .line 855
    check-cast v11, Lac3;

    .line 856
    .line 857
    move/from16 v17, v12

    .line 858
    .line 859
    move/from16 v18, v13

    .line 860
    .line 861
    iget-wide v12, v11, Lac3;->c:J

    .line 862
    .line 863
    shr-long v11, v12, v17

    .line 864
    .line 865
    long-to-int v11, v11

    .line 866
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 867
    .line 868
    .line 869
    move-result v11

    .line 870
    add-float v13, v11, v18

    .line 871
    .line 872
    add-int/lit8 v8, v8, 0x1

    .line 873
    .line 874
    move/from16 v12, v17

    .line 875
    .line 876
    goto :goto_13

    .line 877
    :cond_35
    move/from16 v17, v12

    .line 878
    .line 879
    move/from16 v18, v13

    .line 880
    .line 881
    const/16 p2, 0x0

    .line 882
    .line 883
    iget v4, v5, Lj05;->b:I

    .line 884
    .line 885
    int-to-float v7, v4

    .line 886
    div-float v13, v18, v7

    .line 887
    .line 888
    iget-object v7, v5, Lj05;->a:[Ljava/lang/Object;

    .line 889
    .line 890
    move/from16 v11, p2

    .line 891
    .line 892
    const/4 v8, 0x0

    .line 893
    :goto_14
    if-ge v8, v4, :cond_36

    .line 894
    .line 895
    aget-object v12, v7, v8

    .line 896
    .line 897
    check-cast v12, Lac3;

    .line 898
    .line 899
    move-wide/from16 v19, v14

    .line 900
    .line 901
    iget-wide v14, v12, Lac3;->c:J

    .line 902
    .line 903
    and-long v14, v14, v19

    .line 904
    .line 905
    long-to-int v12, v14

    .line 906
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 907
    .line 908
    .line 909
    move-result v12

    .line 910
    add-float/2addr v11, v12

    .line 911
    add-int/lit8 v8, v8, 0x1

    .line 912
    .line 913
    move-wide/from16 v14, v19

    .line 914
    .line 915
    goto :goto_14

    .line 916
    :cond_36
    move-wide/from16 v19, v14

    .line 917
    .line 918
    iget v4, v5, Lj05;->b:I

    .line 919
    .line 920
    int-to-float v4, v4

    .line 921
    div-float v7, v11, v4

    .line 922
    .line 923
    goto :goto_15

    .line 924
    :cond_37
    move/from16 v17, v12

    .line 925
    .line 926
    move-wide/from16 v19, v14

    .line 927
    .line 928
    const/16 p2, 0x0

    .line 929
    .line 930
    :goto_15
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    int-to-long v4, v4

    .line 935
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 936
    .line 937
    .line 938
    move-result v7

    .line 939
    int-to-long v7, v7

    .line 940
    shl-long v4, v4, v17

    .line 941
    .line 942
    and-long v7, v7, v19

    .line 943
    .line 944
    or-long/2addr v4, v7

    .line 945
    if-nez v2, :cond_38

    .line 946
    .line 947
    goto :goto_17

    .line 948
    :cond_38
    if-ne v3, v9, :cond_39

    .line 949
    .line 950
    shr-long v3, v4, v17

    .line 951
    .line 952
    long-to-int v3, v3

    .line 953
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 954
    .line 955
    .line 956
    move-result v3

    .line 957
    goto :goto_16

    .line 958
    :cond_39
    const/4 v7, 0x2

    .line 959
    if-ne v3, v7, :cond_3b

    .line 960
    .line 961
    and-long v3, v4, v19

    .line 962
    .line 963
    long-to-int v3, v3

    .line 964
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 965
    .line 966
    .line 967
    move-result v3

    .line 968
    :goto_16
    sget-object v4, Lsd5;->Y:Lsd5;

    .line 969
    .line 970
    if-ne v2, v4, :cond_3a

    .line 971
    .line 972
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    int-to-long v2, v2

    .line 977
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 978
    .line 979
    .line 980
    move-result v4

    .line 981
    int-to-long v4, v4

    .line 982
    shl-long v2, v2, v17

    .line 983
    .line 984
    and-long v4, v4, v19

    .line 985
    .line 986
    or-long/2addr v4, v2

    .line 987
    goto :goto_17

    .line 988
    :cond_3a
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    int-to-long v4, v2

    .line 993
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 994
    .line 995
    .line 996
    move-result v2

    .line 997
    int-to-long v2, v2

    .line 998
    shl-long v4, v4, v17

    .line 999
    .line 1000
    and-long v2, v2, v19

    .line 1001
    .line 1002
    or-long/2addr v4, v2

    .line 1003
    :cond_3b
    :goto_17
    iget-wide v2, v10, Lac3;->b:J

    .line 1004
    .line 1005
    iget-object v1, v1, Lrb8;->Y:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v1, Lgj4;

    .line 1008
    .line 1009
    invoke-virtual {v1, v2, v3, v4, v5}, Lgj4;->f(JJ)V

    .line 1010
    .line 1011
    .line 1012
    sget-object v1, Ly01;->t:Lox1;

    .line 1013
    .line 1014
    invoke-static {v0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    check-cast v1, Lfw8;

    .line 1019
    .line 1020
    invoke-interface {v1}, Lfw8;->e()F

    .line 1021
    .line 1022
    .line 1023
    move-result v1

    .line 1024
    invoke-virtual {v6}, Lhc3;->d()Lrb8;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    invoke-static {v1, v1}, La38;->a(FF)J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v3

    .line 1032
    invoke-virtual {v2, v3, v4}, Lrb8;->a(J)J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v1

    .line 1036
    invoke-virtual {v6}, Lhc3;->d()Lrb8;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    iget-object v3, v3, Lrb8;->Y:Ljava/lang/Object;

    .line 1041
    .line 1042
    check-cast v3, Lgj4;

    .line 1043
    .line 1044
    iget-object v4, v3, Lgj4;->Y:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v4, Lvu8;

    .line 1047
    .line 1048
    iget-object v5, v4, Lvu8;->d:[Lka1;

    .line 1049
    .line 1050
    const/4 v7, 0x0

    .line 1051
    invoke-static {v7, v5}, Leu;->n0(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1052
    .line 1053
    .line 1054
    const/4 v8, 0x0

    .line 1055
    iput v8, v4, Lvu8;->e:I

    .line 1056
    .line 1057
    iget-object v4, v3, Lgj4;->Z:Ljava/lang/Object;

    .line 1058
    .line 1059
    check-cast v4, Lvu8;

    .line 1060
    .line 1061
    iget-object v5, v4, Lvu8;->d:[Lka1;

    .line 1062
    .line 1063
    invoke-static {v7, v5}, Leu;->n0(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 1064
    .line 1065
    .line 1066
    iput v8, v4, Lvu8;->e:I

    .line 1067
    .line 1068
    const-wide/16 v4, 0x0

    .line 1069
    .line 1070
    iput-wide v4, v3, Lgj4;->X:J

    .line 1071
    .line 1072
    new-instance v3, Lhu1;

    .line 1073
    .line 1074
    invoke-static {v1, v2}, Ljv1;->b(J)J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v1

    .line 1078
    invoke-direct {v3, v1, v2, v9}, Lhu1;-><init>(JZ)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v0, v3}, Lxu1;->g1(Liu1;)V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_18

    .line 1085
    :cond_3c
    invoke-virtual {v0, v5}, Lxu1;->g1(Liu1;)V

    .line 1086
    .line 1087
    .line 1088
    :goto_18
    invoke-virtual {v6}, Lhc3;->a()V

    .line 1089
    .line 1090
    .line 1091
    return-void

    .line 1092
    :cond_3d
    iget-wide v0, v13, Lac3;->a:J

    .line 1093
    .line 1094
    iput-wide v0, v4, Lfc3;->q:J

    .line 1095
    .line 1096
    return-void

    .line 1097
    :cond_3e
    const/16 p2, 0x0

    .line 1098
    .line 1099
    iget-boolean v1, v10, Lac3;->i:Z

    .line 1100
    .line 1101
    if-eqz v1, :cond_3f

    .line 1102
    .line 1103
    invoke-virtual {v0, v5}, Lxu1;->g1(Liu1;)V

    .line 1104
    .line 1105
    .line 1106
    return-void

    .line 1107
    :cond_3f
    iget-object v1, v0, Lxu1;->s0:Lsd5;

    .line 1108
    .line 1109
    new-instance v2, Lzb3;

    .line 1110
    .line 1111
    invoke-direct {v2, v3}, Lzb3;-><init>(I)V

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v10, v1, v2, v9}, Lz51;->M(Lac3;Lsd5;Lzb3;Z)J

    .line 1115
    .line 1116
    .line 1117
    move-result-wide v1

    .line 1118
    invoke-static {v1, v2}, Lz85;->c(J)F

    .line 1119
    .line 1120
    .line 1121
    move-result v1

    .line 1122
    cmpg-float v1, v1, p2

    .line 1123
    .line 1124
    if-nez v1, :cond_40

    .line 1125
    .line 1126
    goto :goto_19

    .line 1127
    :cond_40
    iget-object v0, v0, Lxu1;->s0:Lsd5;

    .line 1128
    .line 1129
    new-instance v1, Lzb3;

    .line 1130
    .line 1131
    invoke-direct {v1, v3}, Lzb3;-><init>(I)V

    .line 1132
    .line 1133
    .line 1134
    const/4 v8, 0x0

    .line 1135
    invoke-static {v10, v0, v1, v8}, Lz51;->M(Lac3;Lsd5;Lzb3;Z)J

    .line 1136
    .line 1137
    .line 1138
    move-result-wide v0

    .line 1139
    new-instance v2, Lzb3;

    .line 1140
    .line 1141
    invoke-direct {v2, v3}, Lzb3;-><init>(I)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v6, v10, v2, v0, v1}, Lhc3;->e(Lac3;Lzb3;J)V

    .line 1145
    .line 1146
    .line 1147
    iput-boolean v9, v10, Lac3;->i:Z

    .line 1148
    .line 1149
    return-void

    .line 1150
    :cond_41
    invoke-static {}, Lb61;->c()V

    .line 1151
    .line 1152
    .line 1153
    :cond_42
    :goto_19
    return-void
.end method

.method public z(Laq5;Lbq5;J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iput-boolean v3, v0, Lxu1;->z0:Z

    .line 9
    .line 10
    iget-boolean v4, v0, Lxu1;->u0:Z

    .line 11
    .line 12
    if-eqz v4, :cond_3a

    .line 13
    .line 14
    iget-object v4, v0, Lxu1;->C0:Lor2;

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    new-instance v4, Lor2;

    .line 19
    .line 20
    invoke-direct {v4, v0}, Lor2;-><init>(Lnr2;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v4}, Loh1;->Y0(Lnh1;)Lnh1;

    .line 24
    .line 25
    .line 26
    iput-object v4, v0, Lxu1;->C0:Lor2;

    .line 27
    .line 28
    :cond_0
    iget-object v4, v0, Lxu1;->H0:Lwl7;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    iget-object v4, v0, Lxu1;->A0:Lau1;

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    new-instance v4, Lau1;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v6, Lzt1;->Z:Lzt1;

    .line 43
    .line 44
    iput-object v6, v4, Lau1;->g:Lzt1;

    .line 45
    .line 46
    iput-boolean v5, v4, Lau1;->h:Z

    .line 47
    .line 48
    iput-boolean v5, v4, Lau1;->i:Z

    .line 49
    .line 50
    iput-object v4, v0, Lxu1;->A0:Lau1;

    .line 51
    .line 52
    :cond_1
    iput-object v4, v0, Lxu1;->H0:Lwl7;

    .line 53
    .line 54
    :cond_2
    instance-of v6, v4, Lau1;

    .line 55
    .line 56
    const-wide v7, 0x7fffffffffffffffL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    sget-object v9, Lbq5;->X:Lbq5;

    .line 62
    .line 63
    const-wide/16 v10, 0x0

    .line 64
    .line 65
    sget-object v12, Lbq5;->Y:Lbq5;

    .line 66
    .line 67
    if-eqz v6, :cond_b

    .line 68
    .line 69
    check-cast v4, Lau1;

    .line 70
    .line 71
    iget-object v6, v1, Laq5;->a:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_3

    .line 78
    .line 79
    goto/16 :goto_13

    .line 80
    .line 81
    :cond_3
    invoke-static {v1, v5}, Lq18;->e(Laq5;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_4

    .line 86
    .line 87
    goto/16 :goto_13

    .line 88
    .line 89
    :cond_4
    iget-object v1, v1, Laq5;->a:Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v1}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Lhq5;

    .line 96
    .line 97
    iget-object v5, v4, Lau1;->g:Lzt1;

    .line 98
    .line 99
    sget-object v6, Lsu1;->a:[I

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    aget v5, v6, v5

    .line 106
    .line 107
    sget-object v6, Lzt1;->Y:Lzt1;

    .line 108
    .line 109
    sget-object v13, Lzt1;->X:Lzt1;

    .line 110
    .line 111
    if-ne v5, v3, :cond_6

    .line 112
    .line 113
    invoke-virtual {v0}, Lxu1;->q1()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_5

    .line 118
    .line 119
    move-object v5, v13

    .line 120
    goto :goto_0

    .line 121
    :cond_5
    move-object v5, v6

    .line 122
    goto :goto_0

    .line 123
    :cond_6
    iget-object v5, v4, Lau1;->g:Lzt1;

    .line 124
    .line 125
    :goto_0
    iput-object v5, v4, Lau1;->g:Lzt1;

    .line 126
    .line 127
    if-ne v2, v9, :cond_8

    .line 128
    .line 129
    if-ne v5, v6, :cond_7

    .line 130
    .line 131
    invoke-virtual {v1}, Lhq5;->a()V

    .line 132
    .line 133
    .line 134
    iput-boolean v3, v4, Lau1;->h:Z

    .line 135
    .line 136
    :cond_7
    iput-boolean v3, v4, Lau1;->i:Z

    .line 137
    .line 138
    :cond_8
    if-ne v2, v12, :cond_3a

    .line 139
    .line 140
    if-ne v5, v13, :cond_9

    .line 141
    .line 142
    iget-wide v2, v1, Lhq5;->a:J

    .line 143
    .line 144
    const-wide/16 v4, 0x0

    .line 145
    .line 146
    const/16 v6, 0xc

    .line 147
    .line 148
    invoke-static/range {v0 .. v6}, Lxu1;->f1(Lxu1;Lhq5;JJI)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_9
    iget-boolean v2, v4, Lau1;->h:Z

    .line 153
    .line 154
    if-eqz v2, :cond_3a

    .line 155
    .line 156
    invoke-virtual {v0, v1, v1, v10, v11}, Lxu1;->p1(Lhq5;Lhq5;J)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v10, v11, v1}, Lxu1;->o1(JLhq5;)V

    .line 160
    .line 161
    .line 162
    iget-wide v1, v1, Lhq5;->a:J

    .line 163
    .line 164
    iget-object v3, v0, Lxu1;->E0:Ldu1;

    .line 165
    .line 166
    if-nez v3, :cond_a

    .line 167
    .line 168
    new-instance v3, Ldu1;

    .line 169
    .line 170
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-wide v7, v3, Ldu1;->g:J

    .line 174
    .line 175
    iput-object v3, v0, Lxu1;->E0:Ldu1;

    .line 176
    .line 177
    :cond_a
    iput-wide v1, v3, Ldu1;->g:J

    .line 178
    .line 179
    iput-object v3, v0, Lxu1;->H0:Lwl7;

    .line 180
    .line 181
    return-void

    .line 182
    :cond_b
    instance-of v6, v4, Lcu1;

    .line 183
    .line 184
    sget-object v13, Lbq5;->Z:Lbq5;

    .line 185
    .line 186
    if-eqz v6, :cond_25

    .line 187
    .line 188
    check-cast v4, Lcu1;

    .line 189
    .line 190
    if-ne v2, v9, :cond_c

    .line 191
    .line 192
    goto/16 :goto_13

    .line 193
    .line 194
    :cond_c
    iget-object v1, v1, Laq5;->a:Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    move v9, v5

    .line 201
    :goto_1
    if-ge v9, v6, :cond_e

    .line 202
    .line 203
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    move-object v11, v10

    .line 208
    check-cast v11, Lhq5;

    .line 209
    .line 210
    iget-wide v14, v11, Lhq5;->a:J

    .line 211
    .line 212
    iget-wide v7, v4, Lcu1;->h:J

    .line 213
    .line 214
    invoke-static {v14, v15, v7, v8}, Ljm4;->w(JJ)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_d

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_d
    add-int/lit8 v9, v9, 0x1

    .line 222
    .line 223
    const-wide v7, 0x7fffffffffffffffL

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_e
    const/4 v10, 0x0

    .line 230
    :goto_2
    check-cast v10, Lhq5;

    .line 231
    .line 232
    if-nez v10, :cond_12

    .line 233
    .line 234
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    move v7, v5

    .line 239
    :goto_3
    if-ge v7, v6, :cond_10

    .line 240
    .line 241
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    move-object v9, v8

    .line 246
    check-cast v9, Lhq5;

    .line 247
    .line 248
    iget-boolean v9, v9, Lhq5;->d:Z

    .line 249
    .line 250
    if-eqz v9, :cond_f

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_f
    add-int/lit8 v7, v7, 0x1

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_10
    const/4 v8, 0x0

    .line 257
    :goto_4
    move-object v10, v8

    .line 258
    check-cast v10, Lhq5;

    .line 259
    .line 260
    if-nez v10, :cond_11

    .line 261
    .line 262
    invoke-virtual {v0}, Lxu1;->d1()V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_11
    iget-wide v6, v10, Lhq5;->a:J

    .line 267
    .line 268
    iput-wide v6, v4, Lcu1;->h:J

    .line 269
    .line 270
    :cond_12
    const-string v6, "AwaitTouchSlop.touchSlopDetector was not initialized"

    .line 271
    .line 272
    const-string v7, "AwaitTouchSlop.initialDown was not initialized"

    .line 273
    .line 274
    if-ne v2, v12, :cond_21

    .line 275
    .line 276
    invoke-virtual {v10}, Lhq5;->c()Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-nez v8, :cond_1e

    .line 281
    .line 282
    invoke-static {v10}, Lvr3;->m(Lhq5;)Z

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-eqz v8, :cond_16

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    move v8, v5

    .line 293
    :goto_5
    if-ge v8, v3, :cond_14

    .line 294
    .line 295
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    move-object v11, v9

    .line 300
    check-cast v11, Lhq5;

    .line 301
    .line 302
    iget-boolean v11, v11, Lhq5;->d:Z

    .line 303
    .line 304
    if-eqz v11, :cond_13

    .line 305
    .line 306
    move-object v14, v9

    .line 307
    goto :goto_6

    .line 308
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_14
    const/4 v14, 0x0

    .line 312
    :goto_6
    check-cast v14, Lhq5;

    .line 313
    .line 314
    if-nez v14, :cond_15

    .line 315
    .line 316
    invoke-virtual {v0}, Lxu1;->d1()V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_9

    .line 320
    .line 321
    :cond_15
    iget-wide v8, v14, Lhq5;->a:J

    .line 322
    .line 323
    iput-wide v8, v4, Lcu1;->h:J

    .line 324
    .line 325
    goto/16 :goto_9

    .line 326
    .line 327
    :cond_16
    sget-object v1, Ly01;->t:Lox1;

    .line 328
    .line 329
    invoke-static {v0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, Lfw8;

    .line 334
    .line 335
    iget v8, v10, Lhq5;->i:I

    .line 336
    .line 337
    invoke-static {v1, v8}, Lqu1;->g(Lfw8;I)F

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    iget-object v8, v0, Lxu1;->J0:Lkr0;

    .line 342
    .line 343
    if-eqz v8, :cond_1d

    .line 344
    .line 345
    invoke-static {v10, v3}, Lvr3;->S(Lhq5;Z)J

    .line 346
    .line 347
    .line 348
    move-result-wide v11

    .line 349
    invoke-static {v8, v11, v12, v1}, Lkr0;->e(Lkr0;JF)J

    .line 350
    .line 351
    .line 352
    move-result-wide v8

    .line 353
    const-wide v11, 0x7fffffff7fffffffL

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    and-long/2addr v11, v8

    .line 359
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    cmp-long v1, v11, v14

    .line 365
    .line 366
    if-eqz v1, :cond_1c

    .line 367
    .line 368
    invoke-static {v10, v5}, Lvr3;->S(Lhq5;Z)J

    .line 369
    .line 370
    .line 371
    move-result-wide v11

    .line 372
    iget-wide v14, v0, Lxu1;->B0:J

    .line 373
    .line 374
    invoke-static {v14, v15, v11, v12}, Lz85;->f(JJ)J

    .line 375
    .line 376
    .line 377
    move-result-wide v11

    .line 378
    iput-wide v11, v0, Lxu1;->B0:J

    .line 379
    .line 380
    const/16 v1, 0x20

    .line 381
    .line 382
    shr-long/2addr v11, v1

    .line 383
    long-to-int v1, v11

    .line 384
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    iget-wide v11, v0, Lxu1;->B0:J

    .line 393
    .line 394
    const-wide v14, 0xffffffffL

    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    and-long/2addr v11, v14

    .line 400
    long-to-int v11, v11

    .line 401
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 402
    .line 403
    .line 404
    move-result v11

    .line 405
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 406
    .line 407
    .line 408
    move-result v11

    .line 409
    float-to-double v11, v11

    .line 410
    float-to-double v14, v1

    .line 411
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->atan2(DD)D

    .line 412
    .line 413
    .line 414
    move-result-wide v11

    .line 415
    double-to-float v1, v11

    .line 416
    const v11, 0x42652ee1

    .line 417
    .line 418
    .line 419
    mul-float/2addr v1, v11

    .line 420
    iget-object v11, v0, Lxu1;->s0:Lsd5;

    .line 421
    .line 422
    if-nez v11, :cond_17

    .line 423
    .line 424
    :goto_7
    move v11, v3

    .line 425
    goto :goto_8

    .line 426
    :cond_17
    sget-object v12, Ljv1;->a:Liv1;

    .line 427
    .line 428
    sget-object v12, Lsd5;->Y:Lsd5;

    .line 429
    .line 430
    const/high16 v14, 0x41f00000    # 30.0f

    .line 431
    .line 432
    if-ne v11, v12, :cond_19

    .line 433
    .line 434
    cmpg-float v11, v1, v14

    .line 435
    .line 436
    if-gtz v11, :cond_18

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_18
    move v11, v5

    .line 440
    goto :goto_8

    .line 441
    :cond_19
    cmpl-float v11, v1, v14

    .line 442
    .line 443
    if-lez v11, :cond_18

    .line 444
    .line 445
    const/high16 v11, 0x42b40000    # 90.0f

    .line 446
    .line 447
    cmpg-float v11, v1, v11

    .line 448
    .line 449
    if-gtz v11, :cond_18

    .line 450
    .line 451
    goto :goto_7

    .line 452
    :goto_8
    new-instance v12, Laa6;

    .line 453
    .line 454
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 455
    .line 456
    .line 457
    new-instance v14, Lru1;

    .line 458
    .line 459
    invoke-direct {v14, v1, v12}, Lru1;-><init>(FLaa6;)V

    .line 460
    .line 461
    .line 462
    sget-object v1, Ljv1;->a:Liv1;

    .line 463
    .line 464
    new-instance v1, Ly0;

    .line 465
    .line 466
    const/16 v15, 0x1b

    .line 467
    .line 468
    invoke-direct {v1, v14, v15}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 469
    .line 470
    .line 471
    new-instance v14, Lpr2;

    .line 472
    .line 473
    invoke-direct {v14, v1, v5}, Lpr2;-><init>(Lgn2;B)V

    .line 474
    .line 475
    .line 476
    sget-object v1, Lor2;->r0:Lk42;

    .line 477
    .line 478
    invoke-static {v0, v1, v14}, Lts7;->g(Lnh1;Ljava/lang/Object;Lgn2;)V

    .line 479
    .line 480
    .line 481
    if-nez v11, :cond_1a

    .line 482
    .line 483
    iget-boolean v1, v12, Laa6;->X:Z

    .line 484
    .line 485
    if-eqz v1, :cond_1a

    .line 486
    .line 487
    iput-boolean v3, v4, Lcu1;->i:Z

    .line 488
    .line 489
    goto :goto_9

    .line 490
    :cond_1a
    invoke-virtual {v10}, Lhq5;->a()V

    .line 491
    .line 492
    .line 493
    iget-object v1, v4, Lcu1;->g:Lhq5;

    .line 494
    .line 495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v1, v10, v8, v9}, Lxu1;->p1(Lhq5;Lhq5;J)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0, v8, v9, v10}, Lxu1;->o1(JLhq5;)V

    .line 502
    .line 503
    .line 504
    iget-wide v8, v10, Lhq5;->a:J

    .line 505
    .line 506
    iget-object v1, v0, Lxu1;->E0:Ldu1;

    .line 507
    .line 508
    if-nez v1, :cond_1b

    .line 509
    .line 510
    new-instance v1, Ldu1;

    .line 511
    .line 512
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 513
    .line 514
    .line 515
    const-wide v11, 0x7fffffffffffffffL

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    iput-wide v11, v1, Ldu1;->g:J

    .line 521
    .line 522
    iput-object v1, v0, Lxu1;->E0:Ldu1;

    .line 523
    .line 524
    :cond_1b
    iput-wide v8, v1, Ldu1;->g:J

    .line 525
    .line 526
    iput-object v1, v0, Lxu1;->H0:Lwl7;

    .line 527
    .line 528
    goto :goto_9

    .line 529
    :cond_1c
    iput-boolean v3, v4, Lcu1;->i:Z

    .line 530
    .line 531
    iget-wide v8, v0, Lxu1;->B0:J

    .line 532
    .line 533
    invoke-static {v10, v3}, Lvr3;->S(Lhq5;Z)J

    .line 534
    .line 535
    .line 536
    move-result-wide v11

    .line 537
    invoke-static {v8, v9, v11, v12}, Lz85;->f(JJ)J

    .line 538
    .line 539
    .line 540
    move-result-wide v8

    .line 541
    iput-wide v8, v0, Lxu1;->B0:J

    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_1d
    const-string v0, "Touch slop detector not initialized."

    .line 545
    .line 546
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    return-void

    .line 550
    :cond_1e
    iget-object v1, v4, Lcu1;->g:Lhq5;

    .line 551
    .line 552
    if-eqz v1, :cond_20

    .line 553
    .line 554
    iget-wide v8, v4, Lcu1;->h:J

    .line 555
    .line 556
    iget-object v3, v0, Lxu1;->J0:Lkr0;

    .line 557
    .line 558
    if-eqz v3, :cond_1f

    .line 559
    .line 560
    invoke-virtual {v0, v1, v8, v9, v3}, Lxu1;->e1(Lhq5;JLkr0;)V

    .line 561
    .line 562
    .line 563
    goto :goto_9

    .line 564
    :cond_1f
    invoke-static {v6}, Lbt;->q(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    return-void

    .line 568
    :cond_20
    invoke-static {v7}, Lbt;->q(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :cond_21
    :goto_9
    if-ne v2, v13, :cond_3a

    .line 573
    .line 574
    iget-boolean v1, v4, Lcu1;->i:Z

    .line 575
    .line 576
    if-eqz v1, :cond_3a

    .line 577
    .line 578
    invoke-virtual {v10}, Lhq5;->c()Z

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    if-eqz v1, :cond_24

    .line 583
    .line 584
    iget-object v1, v4, Lcu1;->g:Lhq5;

    .line 585
    .line 586
    if-eqz v1, :cond_23

    .line 587
    .line 588
    iget-wide v2, v4, Lcu1;->h:J

    .line 589
    .line 590
    iget-object v4, v0, Lxu1;->J0:Lkr0;

    .line 591
    .line 592
    if-eqz v4, :cond_22

    .line 593
    .line 594
    invoke-virtual {v0, v1, v2, v3, v4}, Lxu1;->e1(Lhq5;JLkr0;)V

    .line 595
    .line 596
    .line 597
    return-void

    .line 598
    :cond_22
    invoke-static {v6}, Lbt;->q(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    return-void

    .line 602
    :cond_23
    invoke-static {v7}, Lbt;->q(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    return-void

    .line 606
    :cond_24
    iput-boolean v5, v4, Lcu1;->i:Z

    .line 607
    .line 608
    return-void

    .line 609
    :cond_25
    instance-of v6, v4, Lbu1;

    .line 610
    .line 611
    if-eqz v6, :cond_2d

    .line 612
    .line 613
    check-cast v4, Lbu1;

    .line 614
    .line 615
    if-eq v2, v13, :cond_26

    .line 616
    .line 617
    goto/16 :goto_13

    .line 618
    .line 619
    :cond_26
    iget-object v1, v1, Laq5;->a:Ljava/util/List;

    .line 620
    .line 621
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    move v6, v5

    .line 626
    :goto_a
    if-ge v6, v2, :cond_28

    .line 627
    .line 628
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    check-cast v7, Lhq5;

    .line 633
    .line 634
    invoke-virtual {v7}, Lhq5;->c()Z

    .line 635
    .line 636
    .line 637
    move-result v7

    .line 638
    if-eqz v7, :cond_27

    .line 639
    .line 640
    move v3, v5

    .line 641
    goto :goto_b

    .line 642
    :cond_27
    add-int/lit8 v6, v6, 0x1

    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_28
    :goto_b
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    :goto_c
    if-ge v5, v2, :cond_2c

    .line 650
    .line 651
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    check-cast v6, Lhq5;

    .line 656
    .line 657
    iget-boolean v6, v6, Lhq5;->d:Z

    .line 658
    .line 659
    if-eqz v6, :cond_2b

    .line 660
    .line 661
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    if-eqz v2, :cond_29

    .line 666
    .line 667
    goto :goto_d

    .line 668
    :cond_29
    if-eqz v3, :cond_3a

    .line 669
    .line 670
    invoke-static {v1}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    check-cast v1, Lhq5;

    .line 675
    .line 676
    iget-wide v1, v1, Lhq5;->c:J

    .line 677
    .line 678
    iget-object v3, v4, Lbu1;->g:Lhq5;

    .line 679
    .line 680
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    iget-wide v5, v3, Lhq5;->c:J

    .line 684
    .line 685
    invoke-static {v1, v2, v5, v6}, Lz85;->e(JJ)J

    .line 686
    .line 687
    .line 688
    move-result-wide v1

    .line 689
    move-wide v2, v1

    .line 690
    iget-object v1, v4, Lbu1;->g:Lhq5;

    .line 691
    .line 692
    if-eqz v1, :cond_2a

    .line 693
    .line 694
    move-wide v5, v2

    .line 695
    iget-wide v2, v4, Lbu1;->h:J

    .line 696
    .line 697
    move-wide v4, v5

    .line 698
    const/16 v6, 0x8

    .line 699
    .line 700
    invoke-static/range {v0 .. v6}, Lxu1;->f1(Lxu1;Lhq5;JJI)V

    .line 701
    .line 702
    .line 703
    return-void

    .line 704
    :cond_2a
    const-string v0, "AwaitGesturePickup.initialDown was not initialized."

    .line 705
    .line 706
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    return-void

    .line 710
    :cond_2b
    add-int/lit8 v5, v5, 0x1

    .line 711
    .line 712
    goto :goto_c

    .line 713
    :cond_2c
    :goto_d
    invoke-virtual {v0}, Lxu1;->d1()V

    .line 714
    .line 715
    .line 716
    return-void

    .line 717
    :cond_2d
    instance-of v6, v4, Ldu1;

    .line 718
    .line 719
    if-eqz v6, :cond_39

    .line 720
    .line 721
    check-cast v4, Ldu1;

    .line 722
    .line 723
    if-eq v2, v12, :cond_2e

    .line 724
    .line 725
    goto/16 :goto_13

    .line 726
    .line 727
    :cond_2e
    iget-wide v6, v4, Ldu1;->g:J

    .line 728
    .line 729
    iget-object v2, v1, Laq5;->a:Ljava/util/List;

    .line 730
    .line 731
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 732
    .line 733
    .line 734
    move-result v8

    .line 735
    move v9, v5

    .line 736
    :goto_e
    if-ge v9, v8, :cond_30

    .line 737
    .line 738
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v12

    .line 742
    move-object v13, v12

    .line 743
    check-cast v13, Lhq5;

    .line 744
    .line 745
    iget-wide v13, v13, Lhq5;->a:J

    .line 746
    .line 747
    invoke-static {v13, v14, v6, v7}, Ljm4;->w(JJ)Z

    .line 748
    .line 749
    .line 750
    move-result v13

    .line 751
    if-eqz v13, :cond_2f

    .line 752
    .line 753
    goto :goto_f

    .line 754
    :cond_2f
    add-int/lit8 v9, v9, 0x1

    .line 755
    .line 756
    goto :goto_e

    .line 757
    :cond_30
    const/4 v12, 0x0

    .line 758
    :goto_f
    check-cast v12, Lhq5;

    .line 759
    .line 760
    if-nez v12, :cond_31

    .line 761
    .line 762
    goto/16 :goto_13

    .line 763
    .line 764
    :cond_31
    invoke-static {v12}, Lvr3;->m(Lhq5;)Z

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    sget-object v6, Leu1;->a:Leu1;

    .line 769
    .line 770
    if-eqz v2, :cond_36

    .line 771
    .line 772
    iget-object v1, v1, Laq5;->a:Ljava/util/List;

    .line 773
    .line 774
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 775
    .line 776
    .line 777
    move-result v2

    .line 778
    move v3, v5

    .line 779
    :goto_10
    if-ge v3, v2, :cond_33

    .line 780
    .line 781
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v7

    .line 785
    move-object v8, v7

    .line 786
    check-cast v8, Lhq5;

    .line 787
    .line 788
    iget-boolean v8, v8, Lhq5;->d:Z

    .line 789
    .line 790
    if-eqz v8, :cond_32

    .line 791
    .line 792
    goto :goto_11

    .line 793
    :cond_32
    add-int/lit8 v3, v3, 0x1

    .line 794
    .line 795
    goto :goto_10

    .line 796
    :cond_33
    const/4 v7, 0x0

    .line 797
    :goto_11
    check-cast v7, Lhq5;

    .line 798
    .line 799
    if-nez v7, :cond_35

    .line 800
    .line 801
    invoke-virtual {v12}, Lhq5;->c()Z

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    if-nez v1, :cond_34

    .line 806
    .line 807
    invoke-static {v12}, Lvr3;->m(Lhq5;)Z

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    if-eqz v1, :cond_34

    .line 812
    .line 813
    sget-object v1, Ly01;->t:Lox1;

    .line 814
    .line 815
    invoke-static {v0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    check-cast v1, Lfw8;

    .line 820
    .line 821
    invoke-interface {v1}, Lfw8;->e()F

    .line 822
    .line 823
    .line 824
    move-result v1

    .line 825
    invoke-virtual {v0}, Lxu1;->n1()Lrb8;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    invoke-static {v2, v12}, Lp38;->a(Lrb8;Lhq5;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0}, Lxu1;->n1()Lrb8;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    invoke-static {v1, v1}, La38;->a(FF)J

    .line 837
    .line 838
    .line 839
    move-result-wide v3

    .line 840
    invoke-virtual {v2, v3, v4}, Lrb8;->a(J)J

    .line 841
    .line 842
    .line 843
    move-result-wide v1

    .line 844
    invoke-virtual {v0}, Lxu1;->n1()Lrb8;

    .line 845
    .line 846
    .line 847
    move-result-object v3

    .line 848
    iget-object v3, v3, Lrb8;->Y:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v3, Lgj4;

    .line 851
    .line 852
    iget-object v4, v3, Lgj4;->Y:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v4, Lvu8;

    .line 855
    .line 856
    iget-object v6, v4, Lvu8;->d:[Lka1;

    .line 857
    .line 858
    const/4 v7, 0x0

    .line 859
    invoke-static {v7, v6}, Leu;->n0(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    iput v5, v4, Lvu8;->e:I

    .line 863
    .line 864
    iget-object v4, v3, Lgj4;->Z:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v4, Lvu8;

    .line 867
    .line 868
    iget-object v6, v4, Lvu8;->d:[Lka1;

    .line 869
    .line 870
    invoke-static {v7, v6}, Leu;->n0(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    iput v5, v4, Lvu8;->e:I

    .line 874
    .line 875
    iput-wide v10, v3, Lgj4;->X:J

    .line 876
    .line 877
    invoke-virtual {v0}, Lxu1;->m1()Ljp0;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    new-instance v4, Lhu1;

    .line 882
    .line 883
    invoke-static {v1, v2}, Ljv1;->b(J)J

    .line 884
    .line 885
    .line 886
    move-result-wide v1

    .line 887
    invoke-direct {v4, v1, v2, v5}, Lhu1;-><init>(JZ)V

    .line 888
    .line 889
    .line 890
    invoke-interface {v3, v4}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    iput-boolean v5, v0, Lxu1;->z0:Z

    .line 894
    .line 895
    goto :goto_12

    .line 896
    :cond_34
    invoke-virtual {v0}, Lxu1;->m1()Ljp0;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    invoke-interface {v1, v6}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    :goto_12
    invoke-virtual {v0}, Lxu1;->d1()V

    .line 904
    .line 905
    .line 906
    return-void

    .line 907
    :cond_35
    iget-wide v0, v7, Lhq5;->a:J

    .line 908
    .line 909
    iput-wide v0, v4, Ldu1;->g:J

    .line 910
    .line 911
    return-void

    .line 912
    :cond_36
    invoke-virtual {v12}, Lhq5;->c()Z

    .line 913
    .line 914
    .line 915
    move-result v1

    .line 916
    if-eqz v1, :cond_37

    .line 917
    .line 918
    invoke-virtual {v0}, Lxu1;->m1()Ljp0;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    invoke-interface {v0, v6}, Ln17;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    return-void

    .line 926
    :cond_37
    invoke-static {v12, v3}, Lvr3;->S(Lhq5;Z)J

    .line 927
    .line 928
    .line 929
    move-result-wide v1

    .line 930
    invoke-static {v1, v2}, Lz85;->c(J)F

    .line 931
    .line 932
    .line 933
    move-result v1

    .line 934
    const/4 v2, 0x0

    .line 935
    cmpg-float v1, v1, v2

    .line 936
    .line 937
    if-nez v1, :cond_38

    .line 938
    .line 939
    goto :goto_13

    .line 940
    :cond_38
    invoke-static {v12, v5}, Lvr3;->S(Lhq5;Z)J

    .line 941
    .line 942
    .line 943
    move-result-wide v1

    .line 944
    invoke-virtual {v0, v1, v2, v12}, Lxu1;->o1(JLhq5;)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v12}, Lhq5;->a()V

    .line 948
    .line 949
    .line 950
    return-void

    .line 951
    :cond_39
    invoke-static {}, Lb61;->c()V

    .line 952
    .line 953
    .line 954
    :cond_3a
    :goto_13
    return-void
.end method
