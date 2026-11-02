.class public final Luz8;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Loh7;

.field public final d:Lh76;

.field public final e:Lu77;

.field public final f:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lng8;

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Luz8;->b:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lrz8;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Lrz8;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Luz8;->c:Loh7;

    .line 29
    .line 30
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Luz8;->d:Lh76;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    const/4 v2, 0x7

    .line 38
    invoke-static {v1, v2, v0}, Lv77;->b(IILl90;)Lu77;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Luz8;->e:Lu77;

    .line 43
    .line 44
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Luz8;->f:Lf76;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final e(Luy7;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Luz8;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lig8;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lig8;->b(Lq51;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lc71;->X:Lc71;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 19
    .line 20
    return-object p0
.end method

.method public final f(Ls51;)V
    .locals 5

    .line 1
    instance-of v0, p1, Ltz8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ltz8;

    .line 7
    .line 8
    iget v1, v0, Ltz8;->h0:I

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
    iput v1, v0, Ltz8;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ltz8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ltz8;-><init>(Luz8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ltz8;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ltz8;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-eq v1, v2, :cond_1

    .line 33
    .line 34
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Luz8;->b:Lvz7;

    .line 48
    .line 49
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lig8;

    .line 54
    .line 55
    iget-object p1, p1, Lig8;->e:Lf76;

    .line 56
    .line 57
    new-instance v1, Lym7;

    .line 58
    .line 59
    const/16 v3, 0xc

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-direct {v1, p0, v4, v3}, Lym7;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 63
    .line 64
    .line 65
    iput v2, v0, Ltz8;->h0:I

    .line 66
    .line 67
    invoke-static {p1, v1, v0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    sget-object p1, Lc71;->X:Lc71;

    .line 72
    .line 73
    if-ne p0, p1, :cond_3

    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    :goto_1
    const-string p0, "SharedFlow never completes, this call should never return."

    .line 77
    .line 78
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
