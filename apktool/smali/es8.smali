.class public final Les8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Les8;

.field public static final b:Lbu5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Les8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Les8;->a:Les8;

    .line 7
    .line 8
    const-string v0, "kotlinx.datetime.UtcOffset"

    .line 9
    .line 10
    invoke-static {v0}, Lkm4;->h(Ljava/lang/String;)Lbu5;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Les8;->b:Lbu5;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lvr8;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lvr8;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1, p0}, Lol7;->t(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p0, Lvr8;->Companion:Lur8;

    .line 2
    .line 3
    invoke-interface {p1}, Lrd1;->s()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lzr8;->a:Lvz7;

    .line 8
    .line 9
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lxr8;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lxr8;

    .line 29
    .line 30
    if-ne v1, p0, :cond_0

    .line 31
    .line 32
    sget-object p0, Lbs8;->a:Lvz7;

    .line 33
    .line 34
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lj$/time/format/DateTimeFormatter;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p0}, Lbs8;->a(Ljava/lang/String;Lj$/time/format/DateTimeFormatter;)Lvr8;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_0
    sget-object p0, Lzr8;->b:Lvz7;

    .line 49
    .line 50
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lxr8;

    .line 55
    .line 56
    if-ne v1, p0, :cond_1

    .line 57
    .line 58
    sget-object p0, Lbs8;->b:Lvz7;

    .line 59
    .line 60
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Lj$/time/format/DateTimeFormatter;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p0}, Lbs8;->a(Ljava/lang/String;Lj$/time/format/DateTimeFormatter;)Lvr8;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_1
    sget-object p0, Lzr8;->c:Lvz7;

    .line 75
    .line 76
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lxr8;

    .line 81
    .line 82
    if-ne v1, p0, :cond_2

    .line 83
    .line 84
    sget-object p0, Lbs8;->c:Lvz7;

    .line 85
    .line 86
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Lj$/time/format/DateTimeFormatter;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {p1, p0}, Lbs8;->a(Ljava/lang/String;Lj$/time/format/DateTimeFormatter;)Lvr8;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_2
    invoke-virtual {v1, p1}, Lg1;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Lvr8;

    .line 105
    .line 106
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Les8;->b:Lbu5;

    .line 2
    .line 3
    return-object p0
.end method
