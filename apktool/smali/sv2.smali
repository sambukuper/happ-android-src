.class public final synthetic Lsv2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/HappApplication;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/HappApplication;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lsv2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lsv2;->Y:Lsu/happ/proxyutility/HappApplication;

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
    .locals 1

    .line 1
    iget-byte v0, p0, Lsv2;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lsv2;->Y:Lsu/happ/proxyutility/HappApplication;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 9
    .line 10
    new-instance v0, Lc16;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lc16;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 17
    .line 18
    new-instance v0, Lqc2;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lqc2;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 25
    .line 26
    new-instance v0, Lqo;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lqo;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_2
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 33
    .line 34
    new-instance v0, Lkf4;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lkf4;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_3
    new-instance v0, Lpr7;

    .line 41
    .line 42
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->q0:Lvz7;

    .line 43
    .line 44
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lxr7;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lpr7;-><init>(Lxr7;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_4
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 55
    .line 56
    new-instance v0, Lq72;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Lq72;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 63
    .line 64
    new-instance v0, Lpi7;

    .line 65
    .line 66
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->D0:Lvz7;

    .line 67
    .line 68
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Lun5;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Lpi7;-><init>(Lun5;)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_6
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 79
    .line 80
    new-instance v0, Lus;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, p0}, Lus;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_7
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 94
    .line 95
    new-instance v0, Lun5;

    .line 96
    .line 97
    invoke-direct {v0, p0}, Lun5;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_8
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 102
    .line 103
    new-instance v0, Lf84;

    .line 104
    .line 105
    invoke-direct {v0, p0}, Lf84;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_9
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 110
    .line 111
    new-instance v0, Loq7;

    .line 112
    .line 113
    invoke-direct {v0, p0}, Loq7;-><init>(Landroid/content/Context;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_a
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 118
    .line 119
    new-instance v0, Le72;

    .line 120
    .line 121
    invoke-direct {v0, p0}, Le72;-><init>(Landroid/content/Context;)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_b
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 126
    .line 127
    new-instance v0, Lvr1;

    .line 128
    .line 129
    invoke-direct {v0, p0}, Lvr1;-><init>(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_c
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 134
    .line 135
    new-instance v0, Lan7;

    .line 136
    .line 137
    invoke-direct {v0, p0}, Lan7;-><init>(Lsu/happ/proxyutility/HappApplication;)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
