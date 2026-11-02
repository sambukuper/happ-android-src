.class public Lo19;
.super Ln19;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public s:Lfe3;

.field public t:Lfe3;

.field public u:Lfe3;


# direct methods
.method public constructor <init>(Lw19;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ln19;-><init>(Lw19;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lo19;->s:Lfe3;

    .line 6
    .line 7
    iput-object p1, p0, Lo19;->t:Lfe3;

    .line 8
    .line 9
    iput-object p1, p0, Lo19;->u:Lfe3;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public j()Lfe3;
    .locals 1

    .line 1
    iget-object v0, p0, Lo19;->t:Lfe3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ll19;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lfe3;->d(Landroid/graphics/Insets;)Lfe3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lo19;->t:Lfe3;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public l()Lfe3;
    .locals 1

    .line 1
    iget-object v0, p0, Lo19;->s:Lfe3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ll19;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lfe3;->d(Landroid/graphics/Insets;)Lfe3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lo19;->s:Lfe3;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public n()Lfe3;
    .locals 1

    .line 1
    iget-object v0, p0, Lo19;->u:Lfe3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ll19;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lfe3;->d(Landroid/graphics/Insets;)Lfe3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lo19;->u:Lfe3;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public q(IIII)Lw19;
    .locals 0

    .line 1
    iget-object p0, p0, Ll19;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-static {p1, p0}, Lw19;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lw19;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public x(Lfe3;)V
    .locals 0

    .line 1
    return-void
.end method
