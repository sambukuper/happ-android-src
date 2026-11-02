.class public final synthetic Ly37;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/ui/ServerActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/ui/ServerActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ly37;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ly37;->Y:Lsu/happ/proxyutility/ui/ServerActivity;

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
    .locals 0

    .line 1
    iget-byte p1, p0, Ly37;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ly37;->Y:Lsu/happ/proxyutility/ui/ServerActivity;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lsu/happ/proxyutility/ui/ServerActivity;->F1:Landroid/widget/EditText;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    iget-object p0, p0, Lsu/happ/proxyutility/ui/ServerActivity;->C1:Landroid/widget/EditText;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void

    .line 24
    :pswitch_1
    iget-object p0, p0, Lsu/happ/proxyutility/ui/ServerActivity;->z1:Landroid/widget/EditText;

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void

    .line 32
    :pswitch_2
    iget-object p0, p0, Lsu/happ/proxyutility/ui/ServerActivity;->w1:Landroid/widget/EditText;

    .line 33
    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void

    .line 40
    :pswitch_3
    iget-object p0, p0, Lsu/happ/proxyutility/ui/ServerActivity;->t1:Landroid/widget/EditText;

    .line 41
    .line 42
    if-eqz p0, :cond_4

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 45
    .line 46
    .line 47
    :cond_4
    return-void

    .line 48
    :pswitch_4
    iget-object p0, p0, Lsu/happ/proxyutility/ui/ServerActivity;->r1:Landroid/widget/EditText;

    .line 49
    .line 50
    if-eqz p0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 53
    .line 54
    .line 55
    :cond_5
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
