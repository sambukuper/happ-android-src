.class public abstract Lsi8;
.super Lri8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvh8;

.field public final b:Ld50;


# direct methods
.method public constructor <init>(Lvh8;Ld50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsi8;->a:Lvh8;

    .line 5
    .line 6
    iput-object p2, p0, Lsi8;->b:Ld50;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public e(Lro3;Lz76;)Lz76;
    .locals 2

    .line 1
    iget-object v0, p2, Lz76;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p2, Lz76;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p2, Lz76;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Class;

    .line 10
    .line 11
    iget-object p0, p0, Lsi8;->a:Lvh8;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lvh8;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    move-object v0, p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0, v1, v0}, Lvh8;->c(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    iput-object v0, p2, Lz76;->g0:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    if-nez v0, :cond_4

    .line 29
    .line 30
    iget-object p0, p2, Lz76;->i0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lgr3;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p2, Lz76;->Y:Z

    .line 36
    .line 37
    sget-object v0, Lgr3;->f0:Lgr3;

    .line 38
    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    iget-object p0, p2, Lz76;->Z:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lro3;->a1(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_2
    sget-object v0, Lgr3;->g0:Lgr3;

    .line 48
    .line 49
    if-ne p0, v0, :cond_3

    .line 50
    .line 51
    iget-object p0, p2, Lz76;->Z:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Lro3;->J0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-object p2

    .line 57
    :cond_4
    invoke-virtual {p1, p2}, Lro3;->e1(Lz76;)V

    .line 58
    .line 59
    .line 60
    return-object p2
.end method
