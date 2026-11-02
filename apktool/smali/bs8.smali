.class public abstract Lbs8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lvz7;

.field public static final b:Lvz7;

.field public static final c:Lvz7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lng8;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lvz7;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lbs8;->a:Lvz7;

    .line 14
    .line 15
    new-instance v0, Lng8;

    .line 16
    .line 17
    const/16 v1, 0x9

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lvz7;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lbs8;->b:Lvz7;

    .line 28
    .line 29
    new-instance v0, Lng8;

    .line 30
    .line 31
    const/16 v1, 0xa

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lvz7;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lbs8;->c:Lvz7;

    .line 42
    .line 43
    return-void
.end method

.method public static final a(Ljava/lang/String;Lj$/time/format/DateTimeFormatter;)Lvr8;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Las8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0, v0}, Lj$/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lj$/time/ZoneOffset;

    .line 11
    .line 12
    new-instance p1, Lvr8;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lvr8;-><init>(Lj$/time/ZoneOffset;)V
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :catch_0
    move-exception p0

    .line 19
    new-instance p1, Ldc1;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method
