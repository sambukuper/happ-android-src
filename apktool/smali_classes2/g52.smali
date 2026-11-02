.class public final synthetic Lg52;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lj52;

.field public final synthetic b:Lsu/happ/proxyutility/dto/ExcludeSettingsCache;


# direct methods
.method public synthetic constructor <init>(Lj52;Lsu/happ/proxyutility/dto/ExcludeSettingsCache;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg52;->a:Lj52;

    .line 5
    .line 6
    iput-object p2, p0, Lg52;->b:Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p3, 0x6

    .line 2
    if-ne p2, p3, :cond_0

    .line 3
    .line 4
    iget-object p2, p0, Lg52;->a:Lj52;

    .line 5
    .line 6
    iget-object p2, p2, Lj52;->e:Lb1;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p0, p0, Lg52;->b:Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 17
    .line 18
    invoke-virtual {p2, p0, p1}, Lb1;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method
