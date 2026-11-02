.class public final Lws4;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final X:Lys4;

.field public final Y:Z

.field public final Z:Lcz5;


# direct methods
.method public constructor <init>(Lys4;ZLcz5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lws4;->X:Lys4;

    .line 5
    .line 6
    iput-boolean p2, p0, Lws4;->Y:Z

    .line 7
    .line 8
    iput-object p3, p0, Lws4;->Z:Lcz5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lws4;->X:Lys4;

    .line 2
    .line 3
    iget-object v1, v0, Lys4;->a:Ljl1;

    .line 4
    .line 5
    iget-object v2, v1, Ljl1;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Led1;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lys4;->a(Led1;)Lwb4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, v1, Ljl1;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lhl1;

    .line 18
    .line 19
    iget-boolean v2, p0, Lws4;->Y:Z

    .line 20
    .line 21
    iget-object p0, p0, Lws4;->Z:Lcz5;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Lhl1;->e:Lvl;

    .line 26
    .line 27
    invoke-interface {v1, v0, p0}, Ljm;->r(Lwb4;Lcz5;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v1, v1, Lhl1;->e:Lvl;

    .line 37
    .line 38
    invoke-interface {v1, v0, p0}, Ljm;->l(Lwb4;Lcz5;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    :goto_0
    if-nez p0, :cond_2

    .line 49
    .line 50
    sget-object p0, Ld02;->X:Ld02;

    .line 51
    .line 52
    :cond_2
    return-object p0
.end method
