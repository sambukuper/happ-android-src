.class public final synthetic Lrj4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lrj4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lrj4;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object p0, p0, Lrj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v11, p1

    .line 14
    check-cast v11, Llp2;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sget p2, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 23
    .line 24
    and-int/lit8 p2, p1, 0x3

    .line 25
    .line 26
    if-eq p2, v3, :cond_0

    .line 27
    .line 28
    move v2, v4

    .line 29
    :cond_0
    and-int/2addr p1, v4

    .line 30
    invoke-virtual {v11, p1, v2}, Llp2;->N(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->f1:Ly5;

    .line 41
    .line 42
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    move-object v6, p1

    .line 47
    check-cast v6, Lsq6;

    .line 48
    .line 49
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->g1:Ly5;

    .line 50
    .line 51
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    move-object v7, p1

    .line 56
    check-cast v7, Lgw5;

    .line 57
    .line 58
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->h1:Ly5;

    .line 59
    .line 60
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    move-object v8, p1

    .line 65
    check-cast v8, Ldr2;

    .line 66
    .line 67
    iget-object p1, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->i1:Ly5;

    .line 68
    .line 69
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    move-object v9, p1

    .line 74
    check-cast v9, Lza3;

    .line 75
    .line 76
    iget-object p0, p0, Lsu/happ/proxyutility/feature/main/MainActivity;->j1:Ly5;

    .line 77
    .line 78
    invoke-virtual {p0}, Ly5;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    move-object v10, p0

    .line 83
    check-cast v10, Lkr7;

    .line 84
    .line 85
    const v12, 0x49248

    .line 86
    .line 87
    .line 88
    invoke-static/range {v5 .. v12}, Lw39;->e(Lsu/happ/proxyutility/feature/main/MainViewModel;Lsq6;Lgw5;Ldr2;Lza3;Lkr7;Llp2;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v11}, Llp2;->Q()V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-object v1

    .line 96
    :pswitch_0
    check-cast p1, Llp2;

    .line 97
    .line 98
    check-cast p2, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 105
    .line 106
    and-int/lit8 v0, p2, 0x3

    .line 107
    .line 108
    if-eq v0, v3, :cond_2

    .line 109
    .line 110
    move v2, v4

    .line 111
    :cond_2
    and-int/2addr p2, v4

    .line 112
    invoke-virtual {p1, p2, v2}, Llp2;->N(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_3

    .line 117
    .line 118
    new-instance p2, Lrj4;

    .line 119
    .line 120
    invoke-direct {p2, p0, v4}, Lrj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 121
    .line 122
    .line 123
    const p0, 0x163142ab

    .line 124
    .line 125
    .line 126
    invoke-static {p0, p2, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const/4 p2, 0x6

    .line 131
    invoke-static {p0, p1, p2}, Li21;->a(Lzy0;Llp2;I)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-virtual {p1}, Llp2;->Q()V

    .line 136
    .line 137
    .line 138
    :goto_1
    return-object v1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
