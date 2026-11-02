.class public final Lj81;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh91;


# instance fields
.field public final synthetic X:Lk81;


# direct methods
.method public constructor <init>(Lk81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj81;->X:Lk81;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj81;->X:Lk81;

    .line 2
    .line 3
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 4
    .line 5
    iget-object p0, p0, Lfu6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/blacksquircle/ui/editorkit/widget/TextProcessor;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj81;->X:Lk81;

    .line 2
    .line 3
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 4
    .line 5
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj81;->X:Lk81;

    .line 2
    .line 3
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 4
    .line 5
    iget-object p0, p0, Lfu6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/blacksquircle/ui/editorkit/widget/TextProcessor;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lj81;->X:Lk81;

    .line 2
    .line 3
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "input_method"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 17
    .line 18
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 19
    .line 20
    iget-object p0, p0, Lfu6;->Z:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lcom/blacksquircle/ui/editorkit/widget/TextProcessor;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj81;->X:Lk81;

    .line 2
    .line 3
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 4
    .line 5
    iget-object p0, p0, Lfu6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/blacksquircle/ui/editorkit/widget/TextProcessor;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
