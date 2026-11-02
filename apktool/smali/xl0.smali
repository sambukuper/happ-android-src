.class public final synthetic Lxl0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lxl0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lxl0;->Y:Landroid/content/Context;

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
    .locals 3

    .line 1
    iget-byte v0, p0, Lxl0;->X:B

    .line 2
    .line 3
    const-string v1, "notification"

    .line 4
    .line 5
    iget-object p0, p0, Lxl0;->Y:Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Ln69;->a:Llibxray/XRayPoint;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-static {p0, v0}, Ln69;->b(Landroid/content/Context;Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast p0, Landroid/app/NotificationManager;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    invoke-static {p0}, Lue3;->y(Landroid/content/Context;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_2
    new-instance v0, Lf63;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lf63;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lt63;

    .line 52
    .line 53
    const/16 v1, 0x3fdf

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-static {p0, v2, v1}, Lt63;->a(Lt63;Ls72;I)Lt63;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iput-object p0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 61
    .line 62
    const/16 v1, 0x3fef

    .line 63
    .line 64
    invoke-static {p0, v2, v1}, Lt63;->a(Lt63;Ls72;I)Lt63;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iput-object p0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 69
    .line 70
    const/16 v1, 0x3fbf

    .line 71
    .line 72
    invoke-static {p0, v2, v1}, Lt63;->a(Lt63;Ls72;I)Lt63;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p0, v0, Lf63;->Z:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {v0}, Lf63;->k()Lv76;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_3
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    check-cast p0, Landroid/app/NotificationManager;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_4
    new-instance v0, Ldm6;

    .line 94
    .line 95
    invoke-direct {v0, p0}, Ldm6;-><init>(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
