.class public final synthetic Lv;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/settings/AboutSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/settings/AboutSettingsFragment;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lv;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv;->Y:Lsu/happ/proxyutility/feature/settings/AboutSettingsFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 11

    .line 1
    iget-byte p1, p0, Lv;->X:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, Lv;->Y:Lsu/happ/proxyutility/feature/settings/AboutSettingsFragment;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v1, Landroid/content/Intent;

    .line 14
    .line 15
    invoke-virtual {p0}, Lqk2;->N()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-class v2, Lsu/happ/proxyutility/feature/report/ReportActivity;

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 25
    .line 26
    .line 27
    return v0

    .line 28
    :pswitch_0
    invoke-virtual {p0}, Lqk2;->M()Landroidx/fragment/app/FragmentActivity;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Lsu/happ/proxyutility/ui/BaseActivity;

    .line 34
    .line 35
    sget p1, Ly46;->report_dialog_title:I

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lqk2;->p(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget p1, Ly46;->yes:I

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lqk2;->p(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    sget p1, Ly46;->no:I

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lqk2;->p(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    new-instance v8, Lu;

    .line 54
    .line 55
    const/4 p1, 0x3

    .line 56
    invoke-direct {v8, p0, p1}, Lu;-><init>(Lsu/happ/proxyutility/feature/settings/AboutSettingsFragment;B)V

    .line 57
    .line 58
    .line 59
    sget-object v9, Ldh3;->c:Lj72;

    .line 60
    .line 61
    const/16 v10, 0x19a

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-static/range {v1 .. v10}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 67
    .line 68
    .line 69
    return v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
