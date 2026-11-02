.class public final Lig8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public volatile a:Z

.field public final b:Loh7;

.field public final c:Lh76;

.field public final d:Lu77;

.field public final e:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lrg8;->f0:Lrg8;

    .line 5
    .line 6
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lig8;->b:Loh7;

    .line 11
    .line 12
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lig8;->c:Lh76;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x7

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v2, v1, v0}, Lv77;->b(IILl90;)Lu77;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lig8;->d:Lu77;

    .line 26
    .line 27
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lig8;->e:Lf76;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object p0, p0, Lig8;->c:Lh76;

    .line 2
    .line 3
    iget-object p0, p0, Lh76;->X:Loh7;

    .line 4
    .line 5
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lrg8;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 v0, 0x1

    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    if-eq p0, v2, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    if-eq p0, v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    if-ne p0, v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return v1

    .line 35
    :cond_2
    return v0
.end method

.method public final b(Lq51;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Ldn8;->a:Ldn8;

    .line 2
    .line 3
    instance-of v1, p1, Lhg8;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lhg8;

    .line 9
    .line 10
    iget v2, v1, Lhg8;->h0:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lhg8;->h0:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lhg8;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lhg8;-><init>(Lig8;Lq51;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lhg8;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lc71;->X:Lc71;

    .line 30
    .line 31
    iget v3, v1, Lhg8;->h0:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lig8;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    iget-boolean p1, p0, Lig8;->a:Z

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    iget-object p1, p0, Lig8;->d:Lu77;

    .line 63
    .line 64
    iput v4, v1, Lhg8;->h0:I

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v2, :cond_3

    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_3
    :goto_1
    iput-boolean v4, p0, Lig8;->a:Z

    .line 74
    .line 75
    :cond_4
    return-object v0
.end method
