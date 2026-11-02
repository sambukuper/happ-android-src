.class public final synthetic Lvn0;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# static fields
.field public static final X:Lvn0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lvn0;

    .line 2
    .line 3
    const-string v4, "javaTypeNotSupported()Ljava/lang/Void;"

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    const-class v2, Lyn0;

    .line 8
    .line 9
    const-string v3, "javaTypeNotSupported"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lno2;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lvn0;->X:Lvn0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p0, Lp14;

    .line 2
    .line 3
    const-string v0, "javaType for captured types is not supported"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
