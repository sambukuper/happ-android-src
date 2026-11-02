.class public final Ldt5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfi1;


# instance fields
.field public final synthetic X:Lfi1;

.field public Y:Z

.field public Z:Z

.field public final f0:Lq15;


# direct methods
.method public constructor <init>(Lfi1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldt5;->X:Lfi1;

    .line 5
    .line 6
    new-instance p1, Lq15;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Lq15;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ldt5;->f0:Lq15;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final A(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->A(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final D0(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->D0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final G0(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->G0(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final M(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->M(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final R(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->R(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final W(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->W(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldt5;->Z:Z

    .line 3
    .line 4
    iget-object p0, p0, Ldt5;->f0:Lq15;

    .line 5
    .line 6
    invoke-virtual {p0}, Lq15;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lq15;->m(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldt5;->Y:Z

    .line 3
    .line 4
    iget-object p0, p0, Ldt5;->f0:Lq15;

    .line 5
    .line 6
    invoke-virtual {p0}, Lq15;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lq15;->m(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final b0()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0}, Lfi1;->b0()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lbt5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lbt5;

    .line 7
    .line 8
    iget v1, v0, Lbt5;->h0:I

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
    iput v1, v0, Lbt5;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbt5;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lbt5;-><init>(Ldt5;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lbt5;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbt5;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput v2, v0, Lbt5;->h0:I

    .line 49
    .line 50
    iget-object p1, p0, Ldt5;->f0:Lq15;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v0, Lc71;->X:Lc71;

    .line 57
    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 62
    iput-boolean p1, p0, Ldt5;->Y:Z

    .line 63
    .line 64
    iput-boolean p1, p0, Ldt5;->Z:Z

    .line 65
    .line 66
    sget-object p0, Ldn8;->a:Ldn8;

    .line 67
    .line 68
    return-object p0
.end method

.method public final d(Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lct5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lct5;

    .line 7
    .line 8
    iget v1, v0, Lct5;->h0:I

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
    iput v1, v0, Lct5;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lct5;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lct5;-><init>(Ldt5;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lct5;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lct5;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iget-object v3, p0, Ldt5;->f0:Lq15;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-boolean p1, p0, Ldt5;->Y:Z

    .line 51
    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    iget-boolean p1, p0, Ldt5;->Z:Z

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    iput v4, v0, Lct5;->h0:I

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lc71;->X:Lc71;

    .line 65
    .line 66
    if-ne p1, v0, :cond_3

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    :goto_1
    invoke-virtual {v3, v2}, Lq15;->m(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-boolean p0, p0, Ldt5;->Y:Z

    .line 73
    .line 74
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0}, Lfi1;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final h0(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->h0(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final q(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->q(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final r(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->r(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final x0(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Ldt5;->X:Lfi1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->x0(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
