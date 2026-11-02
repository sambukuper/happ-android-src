.class public final synthetic Lfc4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lhc4;Lec4;ILjava/lang/String;Lr43;)V
    .locals 0

    .line 16
    const/4 p4, 0x0

    iput-byte p4, p0, Lfc4;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc4;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lfc4;->f0:Ljava/lang/Object;

    iput p3, p0, Lfc4;->Y:I

    iput-object p5, p0, Lfc4;->g0:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljl1;Lqz;ILjava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lfc4;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfc4;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lfc4;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Lfc4;->Y:I

    .line 12
    .line 13
    iput-object p4, p0, Lfc4;->g0:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-byte v0, p0, Lfc4;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lfc4;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lfc4;->Y:I

    .line 6
    .line 7
    iget-object v3, p0, Lfc4;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lfc4;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Ljl1;

    .line 15
    .line 16
    check-cast v3, Lqz;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Runnable;

    .line 19
    .line 20
    iget-object v0, p0, Ljl1;->h0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lwr6;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    :try_start_0
    iget-object v5, p0, Ljl1;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Lwr6;

    .line 28
    .line 29
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    new-instance v6, Laq8;

    .line 33
    .line 34
    invoke-direct {v6, v5, v4}, Laq8;-><init>(Lwr6;B)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v6}, Lwr6;->C(Luz7;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object v5, p0, Ljl1;->X:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Landroid/content/Context;

    .line 43
    .line 44
    const-string v6, "connectivity"

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Landroid/net/ConnectivityManager;

    .line 51
    .line 52
    invoke-virtual {v5}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_0

    .line 63
    .line 64
    invoke-virtual {p0, v3, v2}, Ljl1;->c(Lqz;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_2

    .line 70
    :cond_0
    new-instance v5, Lbq8;

    .line 71
    .line 72
    invoke-direct {v5, p0, v3, v2}, Lbq8;-><init>(Ljl1;Lqz;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v5}, Lwr6;->C(Luz7;)Ljava/lang/Object;
    :try_end_0
    .catch Ltz7; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catch_0
    :try_start_1
    iget-object p0, p0, Ljl1;->f0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Lf63;

    .line 85
    .line 86
    add-int/2addr v2, v4

    .line 87
    const/4 v0, 0x0

    .line 88
    invoke-virtual {p0, v3, v2, v0}, Lf63;->z(Lqz;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :goto_1
    return-void

    .line 93
    :goto_2
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :pswitch_0
    check-cast p0, Lhc4;

    .line 98
    .line 99
    check-cast v3, Lec4;

    .line 100
    .line 101
    check-cast v1, Lr43;

    .line 102
    .line 103
    invoke-virtual {v3, v2}, Lec4;->d(I)V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, Lhc4;->i:Lxy0;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object p0, Lhc4;->p:[B

    .line 112
    .line 113
    invoke-static {v1, p0}, Lvb4;->b(Lr43;[B)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
