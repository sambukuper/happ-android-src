.class public final Lix5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final h0:Lix5;

.field public static final i0:Lix5;

.field public static final j0:Lix5;


# instance fields
.field public final X:Ljava/lang/Boolean;

.field public final Y:Ljava/lang/Integer;

.field public final Z:Ljava/lang/String;

.field public final f0:Lm75;

.field public final g0:Lm75;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lix5;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    invoke-direct/range {v0 .. v7}, Lix5;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lzc1;Lm75;Lm75;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lix5;->h0:Lix5;

    .line 15
    .line 16
    new-instance v1, Lix5;

    .line 17
    .line 18
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    invoke-direct/range {v1 .. v8}, Lix5;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lzc1;Lm75;Lm75;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lix5;->i0:Lix5;

    .line 25
    .line 26
    new-instance v2, Lix5;

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    invoke-direct/range {v2 .. v9}, Lix5;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lzc1;Lm75;Lm75;)V

    .line 30
    .line 31
    .line 32
    sput-object v2, Lix5;->j0:Lix5;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lzc1;Lm75;Lm75;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lix5;->X:Ljava/lang/Boolean;

    .line 5
    .line 6
    iput-object p3, p0, Lix5;->Y:Ljava/lang/Integer;

    .line 7
    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    :cond_0
    const/4 p4, 0x0

    .line 17
    :cond_1
    iput-object p4, p0, Lix5;->Z:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p6, p0, Lix5;->f0:Lm75;

    .line 20
    .line 21
    iput-object p7, p0, Lix5;->g0:Lm75;

    .line 22
    .line 23
    return-void
.end method
