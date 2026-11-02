.class public final Ltk2;
.super Lvj8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfx8;
.implements Laa5;
.implements Lyv6;
.implements Lql2;


# instance fields
.field public final B0:Landroidx/appcompat/app/AppCompatActivity;

.field public final C0:Landroidx/appcompat/app/AppCompatActivity;

.field public final D0:Landroid/os/Handler;

.field public final E0:Lml2;

.field public final synthetic F0:Landroidx/appcompat/app/AppCompatActivity;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ltk2;->B0:Landroidx/appcompat/app/AppCompatActivity;

    .line 12
    .line 13
    iput-object p1, p0, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 14
    .line 15
    iput-object v0, p0, Ltk2;->D0:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance p1, Lml2;

    .line 18
    .line 19
    invoke-direct {p1}, Lml2;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ltk2;->E0:Lml2;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final W(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final X()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lz95;
    .locals 0

    .line 1
    iget-object p0, p0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->b()Lz95;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final e()Lex8;
    .locals 0

    .line 1
    iget-object p0, p0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->e()Lex8;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final f()Lxd6;
    .locals 0

    .line 1
    iget-object p0, p0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/activity/ComponentActivity;->f0:Lxd6;

    .line 4
    .line 5
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lxd6;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h()Lg94;
    .locals 0

    .line 1
    iget-object p0, p0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->z0:Lg94;

    .line 4
    .line 5
    return-object p0
.end method
