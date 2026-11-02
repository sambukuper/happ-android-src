.class public final Loo4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public final synthetic h0:Lsu/happ/proxyutility/feature/main/MainViewModel;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Loo4;->h0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Loo4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Loo4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Loo4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 0

    .line 1
    new-instance p2, Loo4;

    .line 2
    .line 3
    iget-object p0, p0, Loo4;->h0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    invoke-direct {p2, p0, p1}, Loo4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Loo4;->g0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Loo4;->h0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 23
    .line 24
    iget-object v0, p1, Lsu/happ/proxyutility/feature/main/MainViewModel;->l:Lvz7;

    .line 25
    .line 26
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lmn6;

    .line 31
    .line 32
    iget-object v0, v0, Lmn6;->h:Lvz7;

    .line 33
    .line 34
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lmh7;

    .line 39
    .line 40
    new-instance v3, Lko4;

    .line 41
    .line 42
    const/4 v4, 0x2

    .line 43
    invoke-direct {v3, v4, v2}, Luy7;-><init>(ILq51;)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Lsf2;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-direct {v5, v0, v3, v6}, Lsf2;-><init>(Lxe2;Lrn2;B)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lva1;

    .line 53
    .line 54
    invoke-direct {v0, v5, v1}, Lva1;-><init>(Lsf2;B)V

    .line 55
    .line 56
    .line 57
    new-instance v3, Lnw2;

    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    invoke-direct {v3, v5}, Lnw2;-><init>(B)V

    .line 61
    .line 62
    .line 63
    sget-object v7, Lw51;->l:Lzx6;

    .line 64
    .line 65
    invoke-static {v4, v3}, Lci8;->i(ILjava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v7, v3}, Lw51;->u(Lxe2;Lgn2;Lrn2;)Llq1;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v3, Ler2;

    .line 73
    .line 74
    invoke-direct {v3, v4, v2, v1}, Ler2;-><init>(ILq51;B)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Lj31;

    .line 78
    .line 79
    const/4 v7, 0x7

    .line 80
    invoke-direct {v4, v3, v7}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Llo4;

    .line 84
    .line 85
    invoke-direct {v3, v5, v2}, Llo4;-><init>(ILq51;)V

    .line 86
    .line 87
    .line 88
    new-instance v5, Lqg2;

    .line 89
    .line 90
    invoke-direct {v5, v0, v4, v3, v6}, Lqg2;-><init>(Lxe2;Ljava/lang/Object;Lon2;B)V

    .line 91
    .line 92
    .line 93
    sget-object v0, Ltp1;->a:Lnf1;

    .line 94
    .line 95
    invoke-static {v5, v0}, Lzc1;->H(Lxe2;Ls61;)Lxe2;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v3, Lyn4;

    .line 100
    .line 101
    invoke-direct {v3, p1, v2, v1}, Lyn4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 102
    .line 103
    .line 104
    iput-boolean v1, p0, Loo4;->g0:Z

    .line 105
    .line 106
    invoke-static {v0, v3, p0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    sget-object p1, Lc71;->X:Lc71;

    .line 111
    .line 112
    if-ne p0, p1, :cond_2

    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_2
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 116
    .line 117
    return-object p0
.end method
