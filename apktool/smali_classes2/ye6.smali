.class public final synthetic Lye6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lye6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lye6;->Y:Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;

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
    .locals 12

    .line 1
    iget-byte p1, p0, Lye6;->X:B

    .line 2
    .line 3
    const/high16 v0, 0x1040000

    .line 4
    .line 5
    const v1, 0x104000a

    .line 6
    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget p1, Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;->T0:I

    .line 12
    .line 13
    sget p1, Ly46;->dialog_reset_title:I

    .line 14
    .line 15
    iget-object v2, p0, Lye6;->Y:Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sget p0, Ly46;->dialog_reset_settings_description:I

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    new-instance v9, Lze6;

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    invoke-direct {v9, v2, p0}, Lze6;-><init>(Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;B)V

    .line 39
    .line 40
    .line 41
    new-instance v10, Lw76;

    .line 42
    .line 43
    const/4 p0, 0x5

    .line 44
    invoke-direct {v10, p0}, Lw76;-><init>(B)V

    .line 45
    .line 46
    .line 47
    const/16 v11, 0x192

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v8, 0x0

    .line 51
    invoke-static/range {v2 .. v11}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_0
    sget p1, Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;->T0:I

    .line 56
    .line 57
    sget p1, Ly46;->dialog_reset_title:I

    .line 58
    .line 59
    iget-object v2, p0, Lye6;->Y:Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;

    .line 60
    .line 61
    invoke-virtual {v2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget p0, Ly46;->dialog_reset_user_settings_description:I

    .line 66
    .line 67
    invoke-virtual {v2, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    new-instance v9, Lw76;

    .line 80
    .line 81
    const/4 p0, 0x6

    .line 82
    invoke-direct {v9, p0}, Lw76;-><init>(B)V

    .line 83
    .line 84
    .line 85
    new-instance v10, Lw76;

    .line 86
    .line 87
    const/4 p0, 0x7

    .line 88
    invoke-direct {v10, p0}, Lw76;-><init>(B)V

    .line 89
    .line 90
    .line 91
    const/16 v11, 0x192

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    invoke-static/range {v2 .. v11}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
