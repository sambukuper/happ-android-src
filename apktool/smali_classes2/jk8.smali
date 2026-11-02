.class public final Ljk8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh91;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lc67;


# direct methods
.method public synthetic constructor <init>(Lc67;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ljk8;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ljk8;->Y:Lc67;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Ljk8;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ljk8;->Y:Lc67;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 9
    .line 10
    iget-object v0, v0, Lem2;->Z:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 18
    .line 19
    iget-object v0, v0, Lem2;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :pswitch_1
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 27
    .line 28
    iget-object v0, v0, Lem2;->Y:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Ljk8;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ljk8;->Y:Lc67;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 9
    .line 10
    iget-object v0, v0, Lem2;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 18
    .line 19
    iget-object v0, v0, Lem2;->Y:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :pswitch_1
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Ljk8;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ljk8;->Y:Lc67;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lc67;->Z:Lsu/happ/proxyutility/feature/settings/SettingsActivity;

    .line 9
    .line 10
    iget-object p0, p0, Lsu/happ/proxyutility/feature/settings/SettingsActivity;->Z0:Lvz7;

    .line 11
    .line 12
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lb67;

    .line 17
    .line 18
    iget-object v0, p0, Lb67;->Y:Ldm2;

    .line 19
    .line 20
    iget-object v0, v0, Ldm2;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lb67;->a(Landroid/view/View;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 28
    .line 29
    iget-object v0, v0, Lem2;->Z:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :pswitch_1
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 37
    .line 38
    iget-object v0, v0, Lem2;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Ljk8;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ljk8;->Y:Lc67;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 9
    .line 10
    iget-object v0, v0, Lem2;->Z:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 18
    .line 19
    iget-object v0, v0, Lem2;->f0:Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :pswitch_1
    iget-object v0, p0, Lc67;->Y:Lem2;

    .line 27
    .line 28
    iget-object v0, v0, Lem2;->Y:Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lc67;->a(Landroid/view/View;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
