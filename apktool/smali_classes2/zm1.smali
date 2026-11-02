.class public final synthetic Lzm1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lzm1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lzm1;->Y:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lzm1;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lzm1;->Y:Landroid/widget/TextView;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/button/HappTextButton;

    .line 9
    .line 10
    sget v0, Lsu/happ/proxyutility/ui/foundation/component/button/HappTextButton;->k0:I

    .line 11
    .line 12
    sget-object v0, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;->o0:Lvz7;

    .line 13
    .line 14
    invoke-static {p0}, Lk32;->l(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 19
    .line 20
    sget-object v0, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;->o0:Lvz7;

    .line 21
    .line 22
    invoke-static {p0}, Lk32;->l(Landroid/widget/TextView;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
