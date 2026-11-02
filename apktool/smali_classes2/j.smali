.class public final synthetic Lj;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lj;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lj;->Y:Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-byte p1, p0, Lj;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lj;->Y:Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->R0:Ly5;

    .line 9
    .line 10
    sget v0, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->T0:I

    .line 11
    .line 12
    :try_start_0
    sget-object v0, Lss8;->a:Lss8;

    .line 13
    .line 14
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ly;

    .line 19
    .line 20
    iget-object v0, v0, Ly;->d:Lh76;

    .line 21
    .line 22
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 23
    .line 24
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lw;

    .line 29
    .line 30
    iget-object v0, v0, Lw;->f0:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p0, v0}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Lsj6;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lsj6;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    new-instance v1, Lrj6;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-static {v1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    :try_start_1
    sget-object v0, Lss8;->a:Lss8;

    .line 63
    .line 64
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ly;

    .line 69
    .line 70
    iget-object p1, p1, Ly;->d:Lh76;

    .line 71
    .line 72
    iget-object p1, p1, Lh76;->X:Loh7;

    .line 73
    .line 74
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lw;

    .line 79
    .line 80
    iget-object p1, p1, Lw;->g0:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {p0, p1}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_1
    move-exception p0

    .line 87
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 88
    .line 89
    if-nez p1, :cond_0

    .line 90
    .line 91
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 92
    .line 93
    if-nez p1, :cond_0

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_0
    throw p0

    .line 97
    :cond_1
    :goto_1
    return-void

    .line 98
    :cond_2
    throw v0

    .line 99
    :pswitch_0
    sget p1, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->T0:I

    .line 100
    .line 101
    :try_start_2
    sget-object p1, Lss8;->a:Lss8;

    .line 102
    .line 103
    iget-object p1, p0, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->R0:Ly5;

    .line 104
    .line 105
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ly;

    .line 110
    .line 111
    iget-object p1, p1, Ly;->d:Lh76;

    .line 112
    .line 113
    iget-object p1, p1, Lh76;->X:Loh7;

    .line 114
    .line 115
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lw;

    .line 120
    .line 121
    iget-object p1, p1, Lw;->Z:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p0, p1}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :catchall_2
    move-exception p0

    .line 128
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 129
    .line 130
    if-nez p1, :cond_3

    .line 131
    .line 132
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 133
    .line 134
    if-nez p1, :cond_3

    .line 135
    .line 136
    :goto_2
    return-void

    .line 137
    :cond_3
    throw p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
