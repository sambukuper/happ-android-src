.class public final Ltj7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lkq8;


# instance fields
.field public final a:Lpd2;

.field public final b:Lpr8;

.field public final c:Lq15;

.field public d:Lqq8;

.field public final e:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Lpd2;Lpr8;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ltj7;->a:Lpd2;

    .line 11
    .line 12
    iput-object p2, p0, Ltj7;->b:Lpr8;

    .line 13
    .line 14
    invoke-static {}, Lr15;->a()Lq15;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Ltj7;->c:Lq15;

    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Ltj7;->e:Ljava/util/LinkedList;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lrj7;Lqq8;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lsj7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lsj7;

    .line 7
    .line 8
    iget v1, v0, Lsj7;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsj7;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsj7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lsj7;-><init>(Ltj7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lsj7;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsj7;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const-string v3, "CXCP"

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-eq v1, v4, :cond_1

    .line 36
    .line 37
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v3}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    if-eqz p3, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    :cond_3
    iput v4, v0, Lsj7;->h0:I

    .line 63
    .line 64
    iget-object p0, p0, Ltj7;->a:Lpd2;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lpd2;->a(Ls51;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    sget-object p0, Lc71;->X:Lc71;

    .line 71
    .line 72
    if-ne p3, p0, :cond_4

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    throw v2
.end method

.method public final b(Lqq8;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ltj7;->d:Lqq8;

    .line 2
    .line 3
    iget-object p1, p0, Ltj7;->b:Lpr8;

    .line 4
    .line 5
    iget-object p1, p1, Lpr8;->f:Lm51;

    .line 6
    .line 7
    new-instance v0, Lia1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lia1;-><init>(Ltj7;Lq51;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {p1, v1, v1, v0, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final reset()V
    .locals 4

    .line 1
    iget-object v0, p0, Ltj7;->b:Lpr8;

    .line 2
    .line 3
    iget-object v0, v0, Lpr8;->f:Lm51;

    .line 4
    .line 5
    new-instance v1, Lqk4;

    .line 6
    .line 7
    const/16 v2, 0x13

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, v3, v2}, Lqk4;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 15
    .line 16
    .line 17
    return-void
.end method
