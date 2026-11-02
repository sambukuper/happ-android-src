.class public final Le09;
.super Landroid/webkit/WebChromeClient;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lsu/happ/proxyutility/ui/WebViewActivity;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/ui/WebViewActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le09;->a:Lsu/happ/proxyutility/ui/WebViewActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x64

    .line 5
    .line 6
    if-lt p2, p1, :cond_1

    .line 7
    .line 8
    iget-object p0, p0, Le09;->a:Lsu/happ/proxyutility/ui/WebViewActivity;

    .line 9
    .line 10
    iget-object p0, p0, Lsu/happ/proxyutility/ui/WebViewActivity;->Q0:Lz47;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    const/16 p1, 0x8

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "binding"

    .line 25
    .line 26
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0

    .line 31
    :cond_1
    return-void
.end method
