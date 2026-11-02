.class public final Lyy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lbe7;

.field public final synthetic Z:Ly05;

.field public final synthetic f0:Ly05;


# direct methods
.method public constructor <init>(ZLbe7;Ly05;Ly05;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lyy2;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lyy2;->Y:Lbe7;

    .line 7
    .line 8
    iput-object p3, p0, Lyy2;->Z:Ly05;

    .line 9
    .line 10
    iput-object p4, p0, Lyy2;->f0:Ly05;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lcx3;

    .line 2
    .line 3
    iget-object p1, p1, Lcx3;->a:Landroid/view/KeyEvent;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lyy2;->X:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lyy2;->Z:Ly05;

    .line 13
    .line 14
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Lpu;->d(I)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    sget-wide v2, Lax3;->h:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/4 v0, 0x2

    .line 47
    if-ne p1, v0, :cond_0

    .line 48
    .line 49
    iget-object p1, p0, Lyy2;->f0:Ly05;

    .line 50
    .line 51
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Ly05;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lyy2;->Y:Lbe7;

    .line 57
    .line 58
    if-eqz p0, :cond_0

    .line 59
    .line 60
    check-cast p0, Lai1;

    .line 61
    .line 62
    invoke-virtual {p0}, Lai1;->a()V

    .line 63
    .line 64
    .line 65
    :cond_0
    const/4 p0, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 p0, 0x0

    .line 68
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
