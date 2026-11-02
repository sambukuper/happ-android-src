.class public final enum Lio/sentry/t6;
.super Ljava/lang/Enum;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/n2;


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/t6;

.field public static final enum BUFFER:Lio/sentry/t6;

.field public static final enum SESSION:Lio/sentry/t6;


# direct methods
.method private static synthetic $values()[Lio/sentry/t6;
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/t6;->SESSION:Lio/sentry/t6;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/t6;->BUFFER:Lio/sentry/t6;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lio/sentry/t6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/t6;

    .line 2
    .line 3
    const-string v1, "SESSION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/sentry/t6;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/sentry/t6;->SESSION:Lio/sentry/t6;

    .line 10
    .line 11
    new-instance v0, Lio/sentry/t6;

    .line 12
    .line 13
    const-string v1, "BUFFER"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lio/sentry/t6;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/sentry/t6;->BUFFER:Lio/sentry/t6;

    .line 20
    .line 21
    invoke-static {}, Lio/sentry/t6;->$values()[Lio/sentry/t6;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lio/sentry/t6;->$VALUES:[Lio/sentry/t6;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/t6;
    .locals 1

    .line 1
    const-class v0, Lio/sentry/t6;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/sentry/t6;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/sentry/t6;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/t6;->$VALUES:[Lio/sentry/t6;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lio/sentry/t6;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/sentry/t6;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public serialize(Lio/sentry/r3;Lio/sentry/ILogger;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p1, Lio/sentry/internal/debugmeta/c;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lio/sentry/internal/debugmeta/c;->y(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    .line 14
    .line 15
    .line 16
    return-void
.end method
