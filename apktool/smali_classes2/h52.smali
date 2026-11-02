.class public final Lh52;
.super Lnr4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic M:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lh52;->M:B

    .line 2
    .line 3
    const/16 p1, 0xd

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lnr4;-><init>(B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-byte p0, p0, Lh52;->M:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lsu/happ/proxyutility/dto/PingTypeData;

    .line 7
    .line 8
    check-cast p2, Lsu/happ/proxyutility/dto/PingTypeData;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lsu/happ/proxyutility/dto/PingTypeData;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 16
    .line 17
    check-cast p2, Lsu/happ/proxyutility/dto/AppInfo;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lsu/happ/proxyutility/dto/AppInfo;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :pswitch_1
    check-cast p1, Lsu/happ/proxyutility/dto/LanguageData;

    .line 25
    .line 26
    check-cast p2, Lsu/happ/proxyutility/dto/LanguageData;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lsu/happ/proxyutility/dto/LanguageData;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :pswitch_2
    check-cast p1, Lsu/happ/proxyutility/dto/GeoFileSearchCache;

    .line 34
    .line 35
    check-cast p2, Lsu/happ/proxyutility/dto/GeoFileSearchCache;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lsu/happ/proxyutility/dto/GeoFileSearchCache;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :pswitch_3
    check-cast p1, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 43
    .line 44
    check-cast p2, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-byte p0, p0, Lh52;->M:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lsu/happ/proxyutility/dto/PingTypeData;

    .line 9
    .line 10
    check-cast p2, Lsu/happ/proxyutility/dto/PingTypeData;

    .line 11
    .line 12
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/PingTypeData;->b()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/PingTypeData;->b()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    move v0, v1

    .line 23
    :cond_0
    return v0

    .line 24
    :pswitch_0
    check-cast p1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 25
    .line 26
    check-cast p2, Lsu/happ/proxyutility/dto/AppInfo;

    .line 27
    .line 28
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :pswitch_1
    check-cast p1, Lsu/happ/proxyutility/dto/LanguageData;

    .line 42
    .line 43
    check-cast p2, Lsu/happ/proxyutility/dto/LanguageData;

    .line 44
    .line 45
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/LanguageData;->b()Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/LanguageData;->b()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-ne p0, p1, :cond_1

    .line 54
    .line 55
    move v0, v1

    .line 56
    :cond_1
    return v0

    .line 57
    :pswitch_2
    check-cast p1, Lsu/happ/proxyutility/dto/GeoFileSearchCache;

    .line 58
    .line 59
    check-cast p2, Lsu/happ/proxyutility/dto/GeoFileSearchCache;

    .line 60
    .line 61
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/GeoFileSearchCache;->b()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/GeoFileSearchCache;->b()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    return p0

    .line 74
    :pswitch_3
    check-cast p1, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 75
    .line 76
    check-cast p2, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 77
    .line 78
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    return p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lh52;->M:B

    .line 2
    .line 3
    const-string v1, "update"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2}, Lnr4;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p1, Lsu/happ/proxyutility/dto/PingTypeData;

    .line 16
    .line 17
    check-cast p2, Lsu/happ/proxyutility/dto/PingTypeData;

    .line 18
    .line 19
    new-instance p0, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/PingTypeData;->b()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/PingTypeData;->b()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eq p1, p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    move-object v2, p0

    .line 44
    :cond_1
    return-object v2

    .line 45
    :pswitch_1
    check-cast p1, Lsu/happ/proxyutility/dto/AppInfo;

    .line 46
    .line 47
    check-cast p2, Lsu/happ/proxyutility/dto/AppInfo;

    .line 48
    .line 49
    new-instance p0, Landroid/os/Bundle;

    .line 50
    .line 51
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/AppInfo;->e()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/AppInfo;->e()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eq p1, p2, :cond_2

    .line 63
    .line 64
    const-string p1, "select"

    .line 65
    .line 66
    invoke-virtual {p0, p1, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    move-object v2, p0

    .line 76
    :cond_3
    return-object v2

    .line 77
    :pswitch_2
    check-cast p1, Lsu/happ/proxyutility/dto/LanguageData;

    .line 78
    .line 79
    check-cast p2, Lsu/happ/proxyutility/dto/LanguageData;

    .line 80
    .line 81
    new-instance p0, Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/LanguageData;->b()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/LanguageData;->b()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eq p1, p2, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_5

    .line 104
    .line 105
    move-object v2, p0

    .line 106
    :cond_5
    return-object v2

    .line 107
    :pswitch_3
    check-cast p1, Lsu/happ/proxyutility/dto/GeoFileSearchCache;

    .line 108
    .line 109
    check-cast p2, Lsu/happ/proxyutility/dto/GeoFileSearchCache;

    .line 110
    .line 111
    new-instance p0, Landroid/os/Bundle;

    .line 112
    .line 113
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/GeoFileSearchCache;->c()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/GeoFileSearchCache;->c()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eq p1, p2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-virtual {p0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_7

    .line 134
    .line 135
    move-object v2, p0

    .line 136
    :cond_7
    return-object v2

    .line 137
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
