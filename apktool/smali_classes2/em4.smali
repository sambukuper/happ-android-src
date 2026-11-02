.class public final synthetic Lem4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lem4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lem4;->Y:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lem4;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lem4;->Y:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainViewModel;->i:Lvz7;

    .line 9
    .line 10
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lig8;

    .line 15
    .line 16
    iget-object p0, p0, Lig8;->c:Lh76;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->m()Lyz4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Luh3;

    .line 24
    .line 25
    const/16 v1, 0x19

    .line 26
    .line 27
    invoke-direct {v0, v1}, Luh3;-><init>(B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lqc4;->e:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v2, Lqc4;->k:Ljava/lang/Object;

    .line 36
    .line 37
    if-eq v1, v2, :cond_0

    .line 38
    .line 39
    new-instance v1, Lrs4;

    .line 40
    .line 41
    invoke-virtual {p0}, Lqc4;->d()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v2}, Luh3;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-direct {v1, v2}, Lqc4;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Lyu6;

    .line 53
    .line 54
    invoke-direct {v2}, Lyu6;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v2, v1, Lrs4;->l:Lyu6;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance v1, Lrs4;

    .line 61
    .line 62
    invoke-direct {v1}, Lqc4;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lyu6;

    .line 66
    .line 67
    invoke-direct {v2}, Lyu6;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v2, v1, Lrs4;->l:Lyu6;

    .line 71
    .line 72
    :goto_0
    new-instance v2, Lgq6;

    .line 73
    .line 74
    const/16 v3, 0x10

    .line 75
    .line 76
    invoke-direct {v2, v1, v0, v3}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lbm4;

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    invoke-direct {v0, v2, v3}, Lbm4;-><init>(Lgn2;B)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Lqs4;

    .line 86
    .line 87
    invoke-direct {v2, p0, v0}, Lqs4;-><init>(Lyz4;Lbm4;)V

    .line 88
    .line 89
    .line 90
    iget-object v3, v1, Lrs4;->l:Lyu6;

    .line 91
    .line 92
    invoke-virtual {v3, p0, v2}, Lyu6;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lqs4;

    .line 97
    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    iget-object v4, v3, Lqs4;->b:Lbm4;

    .line 101
    .line 102
    if-ne v4, v0, :cond_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    const-string p0, "This source was already added with the different observer"

    .line 106
    .line 107
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 v1, 0x0

    .line 111
    goto :goto_2

    .line 112
    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    iget v0, v1, Lqc4;->c:I

    .line 116
    .line 117
    if-lez v0, :cond_4

    .line 118
    .line 119
    invoke-virtual {p0, v2}, Lqc4;->f(Lv85;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    :goto_2
    return-object v1

    .line 123
    :pswitch_1
    const/4 v0, 0x0

    .line 124
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->x(Z)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Ldn8;->a:Ldn8;

    .line 128
    .line 129
    return-object p0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
