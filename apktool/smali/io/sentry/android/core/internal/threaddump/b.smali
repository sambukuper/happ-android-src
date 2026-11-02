.class public final Lio/sentry/android/core/internal/threaddump/b;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Ljava/util/regex/Pattern;

.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;

.field public static final q:Ljava/util/regex/Pattern;

.field public static final r:Ljava/util/regex/Pattern;

.field public static final s:Ljava/util/regex/Pattern;

.field public static final t:Ljava/util/regex/Pattern;

.field public static final u:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lio/sentry/s6;

.field public final b:Z

.field public c:Ljava/lang/Long;

.field public final d:Lio/sentry/z;

.field public final e:Ljava/util/HashMap;

.field public final f:Ljava/util/ArrayList;

.field public final g:Lio/sentry/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->h:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "\"(.*)\" (.*) ?sysTid=(\\d+)"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->i:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "----- pid (\\d+) at .*"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->j:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "\\s*\\|\\s*sysTid=(\\d+).*"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->k:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, " *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?"

    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->l:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    const-string v0, " *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->m:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    const-string v0, " *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)"

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->n:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    const-string v0, " *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->o:Ljava/util/regex/Pattern;

    .line 64
    .line 65
    const-string v0, " *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->p:Ljava/util/regex/Pattern;

    .line 72
    .line 73
    const-string v0, " *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->q:Ljava/util/regex/Pattern;

    .line 80
    .line 81
    const-string v0, " *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)"

    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->r:Ljava/util/regex/Pattern;

    .line 88
    .line 89
    const-string v0, " *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))"

    .line 90
    .line 91
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->s:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    const-string v0, " *- waiting to lock an unknown object"

    .line 98
    .line 99
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->t:Ljava/util/regex/Pattern;

    .line 104
    .line 105
    const-string v0, "\\s+"

    .line 106
    .line 107
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lio/sentry/android/core/internal/threaddump/b;->u:Ljava/util/regex/Pattern;

    .line 112
    .line 113
    return-void
.end method

.method public constructor <init>(Lio/sentry/s6;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/d;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Lio/sentry/d;-><init>(B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lio/sentry/android/core/internal/threaddump/b;->g:Lio/sentry/d;

    .line 11
    .line 12
    iput-object p1, p0, Lio/sentry/android/core/internal/threaddump/b;->a:Lio/sentry/s6;

    .line 13
    .line 14
    iput-boolean p2, p0, Lio/sentry/android/core/internal/threaddump/b;->b:Z

    .line 15
    .line 16
    new-instance p2, Lio/sentry/z;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Lio/sentry/z;-><init>(Lio/sentry/s6;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lio/sentry/android/core/internal/threaddump/b;->d:Lio/sentry/z;

    .line 22
    .line 23
    new-instance p1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lio/sentry/android/core/internal/threaddump/b;->e:Ljava/util/HashMap;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lio/sentry/android/core/internal/threaddump/b;->f:Ljava/util/ArrayList;

    .line 36
    .line 37
    return-void
.end method

.method public static a(Lio/sentry/protocol/e0;Lio/sentry/t5;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/protocol/e0;->l0:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v1, p1, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lio/sentry/t5;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget v2, v1, Lio/sentry/t5;->X:I

    .line 21
    .line 22
    iget p1, p1, Lio/sentry/t5;->X:I

    .line 23
    .line 24
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, v1, Lio/sentry/t5;->X:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v1, p1, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v2, Lio/sentry/t5;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iget v3, p1, Lio/sentry/t5;->X:I

    .line 39
    .line 40
    iput v3, v2, Lio/sentry/t5;->X:I

    .line 41
    .line 42
    iput-object v1, v2, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Lio/sentry/t5;->Z:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v3, v2, Lio/sentry/t5;->Z:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lio/sentry/t5;->f0:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v3, v2, Lio/sentry/t5;->f0:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v3, p1, Lio/sentry/t5;->g0:Ljava/lang/Long;

    .line 53
    .line 54
    iput-object v3, v2, Lio/sentry/t5;->g0:Ljava/lang/Long;

    .line 55
    .line 56
    iget-object p1, p1, Lio/sentry/t5;->h0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 57
    .line 58
    invoke-static {p1}, Lio/sentry/util/b;->p(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, v2, Lio/sentry/t5;->h0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    .line 64
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :goto_0
    iput-object v0, p0, Lio/sentry/protocol/e0;->l0:Ljava/util/Map;

    .line 68
    .line 69
    return-void
.end method

.method public static b(Ljava/util/regex/Matcher;I)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public static c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method


# virtual methods
.method public final d(Lx21;)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Lx21;->b:I

    .line 6
    .line 7
    sget-object v3, Lio/sentry/android/core/internal/threaddump/b;->h:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    sget-object v6, Lio/sentry/android/core/internal/threaddump/b;->i:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    sget-object v8, Lio/sentry/android/core/internal/threaddump/b;->j:Ljava/util/regex/Pattern;

    .line 22
    .line 23
    invoke-virtual {v8, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    :goto_0
    iget v9, v1, Lx21;->c:I

    .line 28
    .line 29
    iget-object v10, v0, Lio/sentry/android/core/internal/threaddump/b;->f:Ljava/util/ArrayList;

    .line 30
    .line 31
    const-string v11, "main"

    .line 32
    .line 33
    const/4 v12, 0x1

    .line 34
    if-ge v9, v2, :cond_37

    .line 35
    .line 36
    invoke-virtual {v1}, Lx21;->a()Lio/sentry/android/core/internal/threaddump/a;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    const/4 v13, 0x0

    .line 41
    const-string v14, "Internal error while parsing thread dump."

    .line 42
    .line 43
    iget-object v15, v0, Lio/sentry/android/core/internal/threaddump/b;->a:Lio/sentry/s6;

    .line 44
    .line 45
    if-nez v9, :cond_0

    .line 46
    .line 47
    invoke-virtual {v15}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 52
    .line 53
    new-array v2, v13, [Ljava/lang/Object;

    .line 54
    .line 55
    invoke-interface {v0, v1, v14, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    iget-object v9, v9, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v5, v9}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v16

    .line 65
    const/16 v17, 0x0

    .line 66
    .line 67
    if-nez v16, :cond_e

    .line 68
    .line 69
    invoke-static {v7, v9}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v16

    .line 73
    if-eqz v16, :cond_1

    .line 74
    .line 75
    goto/16 :goto_2

    .line 76
    .line 77
    :cond_1
    invoke-static {v8, v9}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eqz v10, :cond_3

    .line 82
    .line 83
    invoke-static {v8, v12}, Lio/sentry/android/core/internal/threaddump/b;->b(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    iput-object v9, v0, Lio/sentry/android/core/internal/threaddump/b;->c:Ljava/lang/Long;

    .line 88
    .line 89
    :cond_2
    :goto_1
    move/from16 v34, v2

    .line 90
    .line 91
    move-object/from16 v19, v3

    .line 92
    .line 93
    move-object/from16 v31, v4

    .line 94
    .line 95
    move-object/from16 v21, v5

    .line 96
    .line 97
    move-object/from16 v23, v6

    .line 98
    .line 99
    move-object/from16 v25, v7

    .line 100
    .line 101
    move-object/from16 v26, v8

    .line 102
    .line 103
    goto/16 :goto_19

    .line 104
    .line 105
    :cond_3
    const-string v10, "Free memory until OOME "

    .line 106
    .line 107
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    iget-object v11, v0, Lio/sentry/android/core/internal/threaddump/b;->g:Lio/sentry/d;

    .line 112
    .line 113
    if-eqz v10, :cond_4

    .line 114
    .line 115
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    const/16 v11, 0x17

    .line 120
    .line 121
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-static {v9}, Lio/sentry/d;->h(Ljava/lang/String;)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    iput-object v9, v10, Lio/sentry/protocol/c;->k0:Ljava/lang/Long;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const-string v10, "Free memory until GC "

    .line 133
    .line 134
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-eqz v10, :cond_5

    .line 139
    .line 140
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    const/16 v11, 0x15

    .line 145
    .line 146
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-static {v9}, Lio/sentry/d;->h(Ljava/lang/String;)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    iput-object v9, v10, Lio/sentry/protocol/c;->j0:Ljava/lang/Long;

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    const-string v10, "Free memory "

    .line 158
    .line 159
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-eqz v10, :cond_6

    .line 164
    .line 165
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const/16 v11, 0xc

    .line 170
    .line 171
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-static {v9}, Lio/sentry/d;->h(Ljava/lang/String;)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    iput-object v9, v10, Lio/sentry/protocol/c;->i0:Ljava/lang/Long;

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_6
    const-string v10, "Total memory "

    .line 183
    .line 184
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    if-eqz v10, :cond_7

    .line 189
    .line 190
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    const/16 v11, 0xd

    .line 195
    .line 196
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    invoke-static {v9}, Lio/sentry/d;->h(Ljava/lang/String;)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    iput-object v9, v10, Lio/sentry/protocol/c;->l0:Ljava/lang/Long;

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_7
    const-string v10, "Max memory "

    .line 208
    .line 209
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    if-eqz v10, :cond_8

    .line 214
    .line 215
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    const/16 v11, 0xb

    .line 220
    .line 221
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    invoke-static {v9}, Lio/sentry/d;->h(Ljava/lang/String;)Ljava/lang/Long;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    iput-object v9, v10, Lio/sentry/protocol/c;->m0:Ljava/lang/Long;

    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :cond_8
    const-string v10, "Total time waiting for GC to complete: "

    .line 234
    .line 235
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    if-eqz v10, :cond_9

    .line 240
    .line 241
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    const/16 v11, 0x27

    .line 246
    .line 247
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    invoke-static {v9}, Lio/sentry/d;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    iput-object v9, v10, Lio/sentry/protocol/c;->h0:Ljava/lang/Double;

    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :cond_9
    const-string v10, "Total GC time: "

    .line 260
    .line 261
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    if-eqz v10, :cond_a

    .line 266
    .line 267
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    const/16 v11, 0xf

    .line 272
    .line 273
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    invoke-static {v9}, Lio/sentry/d;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    iput-object v9, v10, Lio/sentry/protocol/c;->Y:Ljava/lang/Double;

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :cond_a
    const-string v10, "Total GC count: "

    .line 286
    .line 287
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    if-eqz v10, :cond_b

    .line 292
    .line 293
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    const/16 v11, 0x10

    .line 298
    .line 299
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    :try_start_0
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 308
    .line 309
    .line 310
    move-result-wide v11

    .line 311
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 312
    .line 313
    .line 314
    move-result-object v17
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 315
    :catch_0
    move-object/from16 v9, v17

    .line 316
    .line 317
    iput-object v9, v10, Lio/sentry/protocol/c;->X:Ljava/lang/Long;

    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :cond_b
    const-string v10, "Total blocking GC time: "

    .line 322
    .line 323
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    if-eqz v10, :cond_c

    .line 328
    .line 329
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 330
    .line 331
    .line 332
    move-result-object v10

    .line 333
    const/16 v11, 0x18

    .line 334
    .line 335
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v9

    .line 339
    invoke-static {v9}, Lio/sentry/d;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    iput-object v9, v10, Lio/sentry/protocol/c;->f0:Ljava/lang/Double;

    .line 344
    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :cond_c
    const-string v10, "Total blocking GC count: "

    .line 348
    .line 349
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    const/16 v12, 0x19

    .line 354
    .line 355
    if-eqz v10, :cond_d

    .line 356
    .line 357
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    invoke-virtual {v9, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    :try_start_1
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 370
    .line 371
    .line 372
    move-result-wide v11

    .line 373
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 374
    .line 375
    .line 376
    move-result-object v17
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 377
    :catch_1
    move-object/from16 v9, v17

    .line 378
    .line 379
    iput-object v9, v10, Lio/sentry/protocol/c;->Z:Ljava/lang/Long;

    .line 380
    .line 381
    goto/16 :goto_1

    .line 382
    .line 383
    :cond_d
    const-string v10, "Total pre-OOME GC count: "

    .line 384
    .line 385
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    if-eqz v10, :cond_2

    .line 390
    .line 391
    invoke-virtual {v11}, Lio/sentry/d;->g()Lio/sentry/protocol/c;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    invoke-virtual {v9, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    :try_start_2
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 404
    .line 405
    .line 406
    move-result-wide v11

    .line 407
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 408
    .line 409
    .line 410
    move-result-object v17
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 411
    :catch_2
    move-object/from16 v9, v17

    .line 412
    .line 413
    iput-object v9, v10, Lio/sentry/protocol/c;->g0:Ljava/lang/Long;

    .line 414
    .line 415
    goto/16 :goto_1

    .line 416
    .line 417
    :cond_e
    :goto_2
    iget v9, v1, Lx21;->c:I

    .line 418
    .line 419
    sub-int/2addr v9, v12

    .line 420
    iput v9, v1, Lx21;->c:I

    .line 421
    .line 422
    new-instance v9, Lio/sentry/protocol/e0;

    .line 423
    .line 424
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 428
    .line 429
    .line 430
    move-result-object v12

    .line 431
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 432
    .line 433
    .line 434
    move-result-object v13

    .line 435
    move-object/from16 v19, v3

    .line 436
    .line 437
    iget v3, v1, Lx21;->c:I

    .line 438
    .line 439
    if-ge v3, v2, :cond_f

    .line 440
    .line 441
    invoke-virtual {v1}, Lx21;->a()Lio/sentry/android/core/internal/threaddump/a;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    if-nez v3, :cond_10

    .line 446
    .line 447
    invoke-virtual {v15}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    sget-object v9, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 452
    .line 453
    const/4 v11, 0x0

    .line 454
    new-array v11, v11, [Ljava/lang/Object;

    .line 455
    .line 456
    invoke-interface {v3, v9, v14, v11}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :cond_f
    move/from16 v34, v2

    .line 460
    .line 461
    move-object/from16 v31, v4

    .line 462
    .line 463
    move-object/from16 v21, v5

    .line 464
    .line 465
    move-object/from16 v23, v6

    .line 466
    .line 467
    :goto_3
    move-object/from16 v25, v7

    .line 468
    .line 469
    move-object/from16 v26, v8

    .line 470
    .line 471
    move-object/from16 v28, v10

    .line 472
    .line 473
    :goto_4
    move-object/from16 v9, v17

    .line 474
    .line 475
    goto/16 :goto_18

    .line 476
    .line 477
    :cond_10
    iget-object v3, v3, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    .line 478
    .line 479
    invoke-static {v12, v3}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 480
    .line 481
    .line 482
    move-result v20

    .line 483
    move-object/from16 v21, v5

    .line 484
    .line 485
    const-string v5, "No thread id in the dump, skipping thread."

    .line 486
    .line 487
    move-object/from16 v23, v6

    .line 488
    .line 489
    const/4 v6, 0x4

    .line 490
    if-eqz v20, :cond_14

    .line 491
    .line 492
    invoke-static {v12, v6}, Lio/sentry/android/core/internal/threaddump/b;->b(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    if-nez v3, :cond_11

    .line 497
    .line 498
    invoke-virtual {v15}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    sget-object v6, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 503
    .line 504
    const/4 v11, 0x0

    .line 505
    new-array v9, v11, [Ljava/lang/Object;

    .line 506
    .line 507
    invoke-interface {v3, v6, v5, v9}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    :goto_5
    move/from16 v34, v2

    .line 511
    .line 512
    move-object/from16 v31, v4

    .line 513
    .line 514
    goto :goto_3

    .line 515
    :cond_11
    iput-object v3, v9, Lio/sentry/protocol/e0;->X:Ljava/lang/Long;

    .line 516
    .line 517
    const/4 v3, 0x1

    .line 518
    invoke-virtual {v12, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    iput-object v5, v9, Lio/sentry/protocol/e0;->Z:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    if-eqz v3, :cond_12

    .line 529
    .line 530
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 531
    .line 532
    iput-object v3, v9, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 533
    .line 534
    :cond_12
    const/4 v3, 0x5

    .line 535
    invoke-virtual {v12, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    if-eqz v5, :cond_16

    .line 540
    .line 541
    const-string v3, " "

    .line 542
    .line 543
    invoke-virtual {v5, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    if-eqz v3, :cond_13

    .line 548
    .line 549
    const/16 v3, 0x20

    .line 550
    .line 551
    invoke-virtual {v5, v3}, Ljava/lang/String;->indexOf(I)I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    const/4 v11, 0x0

    .line 556
    invoke-virtual {v5, v11, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    iput-object v3, v9, Lio/sentry/protocol/e0;->f0:Ljava/lang/String;

    .line 561
    .line 562
    goto :goto_6

    .line 563
    :cond_13
    iput-object v5, v9, Lio/sentry/protocol/e0;->f0:Ljava/lang/String;

    .line 564
    .line 565
    goto :goto_6

    .line 566
    :cond_14
    invoke-static {v13, v3}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    if-eqz v3, :cond_16

    .line 571
    .line 572
    const/4 v3, 0x3

    .line 573
    invoke-static {v13, v3}, Lio/sentry/android/core/internal/threaddump/b;->b(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    .line 574
    .line 575
    .line 576
    move-result-object v11

    .line 577
    if-nez v11, :cond_15

    .line 578
    .line 579
    invoke-virtual {v15}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    sget-object v6, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 584
    .line 585
    const/4 v11, 0x0

    .line 586
    new-array v9, v11, [Ljava/lang/Object;

    .line 587
    .line 588
    invoke-interface {v3, v6, v5, v9}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    goto :goto_5

    .line 592
    :cond_15
    iput-object v11, v9, Lio/sentry/protocol/e0;->X:Ljava/lang/Long;

    .line 593
    .line 594
    const/4 v3, 0x1

    .line 595
    invoke-virtual {v13, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    iput-object v5, v9, Lio/sentry/protocol/e0;->Z:Ljava/lang/String;

    .line 600
    .line 601
    iget-object v3, v0, Lio/sentry/android/core/internal/threaddump/b;->c:Ljava/lang/Long;

    .line 602
    .line 603
    invoke-virtual {v11, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    if-eqz v3, :cond_16

    .line 608
    .line 609
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 610
    .line 611
    iput-object v3, v9, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 612
    .line 613
    :cond_16
    :goto_6
    iget-object v3, v0, Lio/sentry/android/core/internal/threaddump/b;->d:Lio/sentry/z;

    .line 614
    .line 615
    iget-object v3, v3, Lio/sentry/z;->X:Lio/sentry/s6;

    .line 616
    .line 617
    new-instance v5, Ljava/util/ArrayList;

    .line 618
    .line 619
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 620
    .line 621
    .line 622
    sget-object v11, Lio/sentry/android/core/internal/threaddump/b;->l:Ljava/util/regex/Pattern;

    .line 623
    .line 624
    invoke-virtual {v11, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 625
    .line 626
    .line 627
    move-result-object v11

    .line 628
    sget-object v12, Lio/sentry/android/core/internal/threaddump/b;->m:Ljava/util/regex/Pattern;

    .line 629
    .line 630
    invoke-virtual {v12, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 631
    .line 632
    .line 633
    move-result-object v12

    .line 634
    sget-object v13, Lio/sentry/android/core/internal/threaddump/b;->n:Ljava/util/regex/Pattern;

    .line 635
    .line 636
    invoke-virtual {v13, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 637
    .line 638
    .line 639
    move-result-object v13

    .line 640
    sget-object v6, Lio/sentry/android/core/internal/threaddump/b;->o:Ljava/util/regex/Pattern;

    .line 641
    .line 642
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 643
    .line 644
    .line 645
    move-result-object v6

    .line 646
    move-object/from16 v24, v3

    .line 647
    .line 648
    sget-object v3, Lio/sentry/android/core/internal/threaddump/b;->q:Ljava/util/regex/Pattern;

    .line 649
    .line 650
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    move-object/from16 v25, v7

    .line 655
    .line 656
    sget-object v7, Lio/sentry/android/core/internal/threaddump/b;->p:Ljava/util/regex/Pattern;

    .line 657
    .line 658
    invoke-virtual {v7, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 659
    .line 660
    .line 661
    move-result-object v7

    .line 662
    move-object/from16 v26, v8

    .line 663
    .line 664
    sget-object v8, Lio/sentry/android/core/internal/threaddump/b;->s:Ljava/util/regex/Pattern;

    .line 665
    .line 666
    invoke-virtual {v8, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 667
    .line 668
    .line 669
    move-result-object v8

    .line 670
    move-object/from16 v27, v15

    .line 671
    .line 672
    sget-object v15, Lio/sentry/android/core/internal/threaddump/b;->r:Ljava/util/regex/Pattern;

    .line 673
    .line 674
    invoke-virtual {v15, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 675
    .line 676
    .line 677
    move-result-object v15

    .line 678
    move-object/from16 v28, v10

    .line 679
    .line 680
    sget-object v10, Lio/sentry/android/core/internal/threaddump/b;->t:Ljava/util/regex/Pattern;

    .line 681
    .line 682
    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 683
    .line 684
    .line 685
    move-result-object v10

    .line 686
    move-object/from16 v29, v10

    .line 687
    .line 688
    sget-object v10, Lio/sentry/android/core/internal/threaddump/b;->u:Ljava/util/regex/Pattern;

    .line 689
    .line 690
    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 691
    .line 692
    .line 693
    move-result-object v10

    .line 694
    move-object/from16 v30, v10

    .line 695
    .line 696
    sget-object v10, Lio/sentry/android/core/internal/threaddump/b;->k:Ljava/util/regex/Pattern;

    .line 697
    .line 698
    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    move-object/from16 v31, v4

    .line 703
    .line 704
    move-object/from16 v32, v15

    .line 705
    .line 706
    move-object/from16 v4, v17

    .line 707
    .line 708
    :goto_7
    iget v15, v1, Lx21;->c:I

    .line 709
    .line 710
    if-ge v15, v2, :cond_17

    .line 711
    .line 712
    invoke-virtual {v1}, Lx21;->a()Lio/sentry/android/core/internal/threaddump/a;

    .line 713
    .line 714
    .line 715
    move-result-object v15

    .line 716
    if-nez v15, :cond_18

    .line 717
    .line 718
    invoke-virtual/range {v27 .. v27}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    sget-object v4, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 723
    .line 724
    const/4 v6, 0x0

    .line 725
    new-array v6, v6, [Ljava/lang/Object;

    .line 726
    .line 727
    invoke-interface {v3, v4, v14, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    :cond_17
    move/from16 v34, v2

    .line 731
    .line 732
    goto/16 :goto_17

    .line 733
    .line 734
    :cond_18
    const/16 v18, 0x0

    .line 735
    .line 736
    iget-object v15, v15, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    .line 737
    .line 738
    invoke-static {v10, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 739
    .line 740
    .line 741
    move-result v33

    .line 742
    if-eqz v33, :cond_1a

    .line 743
    .line 744
    const/4 v1, 0x1

    .line 745
    invoke-static {v10, v1}, Lio/sentry/android/core/internal/threaddump/b;->b(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    .line 746
    .line 747
    .line 748
    move-result-object v15

    .line 749
    if-eqz v15, :cond_19

    .line 750
    .line 751
    iget-object v1, v0, Lio/sentry/android/core/internal/threaddump/b;->c:Ljava/lang/Long;

    .line 752
    .line 753
    invoke-virtual {v15, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    if-eqz v1, :cond_19

    .line 758
    .line 759
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 760
    .line 761
    iput-object v1, v9, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 762
    .line 763
    :cond_19
    move/from16 v34, v2

    .line 764
    .line 765
    move-object/from16 v33, v10

    .line 766
    .line 767
    goto :goto_b

    .line 768
    :cond_1a
    invoke-static {v12, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 769
    .line 770
    .line 771
    move-result v1

    .line 772
    move/from16 v33, v1

    .line 773
    .line 774
    const-string v1, "."

    .line 775
    .line 776
    move/from16 v34, v2

    .line 777
    .line 778
    const/4 v2, 0x2

    .line 779
    if-eqz v33, :cond_20

    .line 780
    .line 781
    new-instance v4, Lio/sentry/protocol/a0;

    .line 782
    .line 783
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 784
    .line 785
    .line 786
    move-object/from16 v33, v10

    .line 787
    .line 788
    const/4 v15, 0x1

    .line 789
    invoke-virtual {v12, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v10

    .line 793
    invoke-virtual {v12, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    if-eqz v10, :cond_1c

    .line 798
    .line 799
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 800
    .line 801
    .line 802
    move-result v15

    .line 803
    if-eqz v15, :cond_1b

    .line 804
    .line 805
    goto :goto_8

    .line 806
    :cond_1b
    invoke-static {v10, v1, v2}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    :cond_1c
    :goto_8
    iput-object v2, v4, Lio/sentry/protocol/a0;->h0:Ljava/lang/String;

    .line 811
    .line 812
    const/4 v1, 0x3

    .line 813
    invoke-virtual {v12, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v10

    .line 817
    iput-object v10, v4, Lio/sentry/protocol/a0;->g0:Ljava/lang/String;

    .line 818
    .line 819
    const/4 v1, 0x4

    .line 820
    invoke-virtual {v12, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v10

    .line 824
    iput-object v10, v4, Lio/sentry/protocol/a0;->f0:Ljava/lang/String;

    .line 825
    .line 826
    const/4 v10, 0x5

    .line 827
    invoke-virtual {v12, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    if-eqz v1, :cond_1e

    .line 832
    .line 833
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 834
    .line 835
    .line 836
    move-result v15

    .line 837
    if-nez v15, :cond_1d

    .line 838
    .line 839
    goto :goto_9

    .line 840
    :cond_1d
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 845
    .line 846
    .line 847
    move-result-object v15

    .line 848
    if-ltz v1, :cond_1e

    .line 849
    .line 850
    goto :goto_a

    .line 851
    :cond_1e
    :goto_9
    move-object/from16 v15, v17

    .line 852
    .line 853
    :goto_a
    iput-object v15, v4, Lio/sentry/protocol/a0;->i0:Ljava/lang/Integer;

    .line 854
    .line 855
    invoke-virtual/range {v24 .. v24}, Lio/sentry/s6;->getInAppIncludes()Ljava/util/List;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    invoke-virtual/range {v24 .. v24}, Lio/sentry/s6;->getInAppExcludes()Ljava/util/List;

    .line 860
    .line 861
    .line 862
    move-result-object v15

    .line 863
    invoke-static {v2, v1, v15}, Lio/sentry/z;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    iput-object v1, v4, Lio/sentry/protocol/a0;->m0:Ljava/lang/Boolean;

    .line 868
    .line 869
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    :goto_b
    move-object/from16 v22, v12

    .line 873
    .line 874
    move-object/from16 v35, v14

    .line 875
    .line 876
    :cond_1f
    :goto_c
    move-object/from16 v14, v29

    .line 877
    .line 878
    move-object/from16 v10, v30

    .line 879
    .line 880
    move-object/from16 v1, v32

    .line 881
    .line 882
    const/4 v2, 0x3

    .line 883
    const/4 v12, 0x4

    .line 884
    goto/16 :goto_16

    .line 885
    .line 886
    :cond_20
    move-object/from16 v33, v10

    .line 887
    .line 888
    const/4 v10, 0x5

    .line 889
    invoke-static {v11, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 890
    .line 891
    .line 892
    move-result v22

    .line 893
    const/16 v10, 0x8

    .line 894
    .line 895
    if-eqz v22, :cond_26

    .line 896
    .line 897
    new-instance v1, Lio/sentry/protocol/a0;

    .line 898
    .line 899
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 900
    .line 901
    .line 902
    const/4 v4, 0x3

    .line 903
    invoke-virtual {v11, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v15

    .line 907
    iput-object v15, v1, Lio/sentry/protocol/a0;->n0:Ljava/lang/String;

    .line 908
    .line 909
    const/4 v4, 0x6

    .line 910
    invoke-virtual {v11, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    iput-object v4, v1, Lio/sentry/protocol/a0;->g0:Ljava/lang/String;

    .line 915
    .line 916
    const/4 v4, 0x7

    .line 917
    invoke-virtual {v11, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    if-eqz v4, :cond_22

    .line 922
    .line 923
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 924
    .line 925
    .line 926
    move-result v15

    .line 927
    if-nez v15, :cond_21

    .line 928
    .line 929
    goto :goto_d

    .line 930
    :cond_21
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 935
    .line 936
    .line 937
    move-result-object v4

    .line 938
    goto :goto_e

    .line 939
    :cond_22
    :goto_d
    move-object/from16 v4, v17

    .line 940
    .line 941
    :goto_e
    iput-object v4, v1, Lio/sentry/protocol/a0;->i0:Ljava/lang/Integer;

    .line 942
    .line 943
    new-instance v4, Ljava/lang/StringBuilder;

    .line 944
    .line 945
    const-string v15, "0x"

    .line 946
    .line 947
    invoke-direct {v4, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v11, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 955
    .line 956
    .line 957
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    iput-object v2, v1, Lio/sentry/protocol/a0;->s0:Ljava/lang/String;

    .line 962
    .line 963
    const-string v2, "native"

    .line 964
    .line 965
    iput-object v2, v1, Lio/sentry/protocol/a0;->p0:Ljava/lang/String;

    .line 966
    .line 967
    invoke-virtual {v11, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v2

    .line 971
    if-nez v2, :cond_23

    .line 972
    .line 973
    move-object/from16 v4, v17

    .line 974
    .line 975
    goto :goto_f

    .line 976
    :cond_23
    invoke-static {v2}, Lio/sentry/config/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v4

    .line 980
    :goto_f
    if-eqz v4, :cond_25

    .line 981
    .line 982
    iget-object v10, v0, Lio/sentry/android/core/internal/threaddump/b;->e:Ljava/util/HashMap;

    .line 983
    .line 984
    invoke-virtual {v10, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v15

    .line 988
    if-nez v15, :cond_24

    .line 989
    .line 990
    new-instance v15, Lio/sentry/protocol/DebugImage;

    .line 991
    .line 992
    invoke-direct {v15}, Lio/sentry/protocol/DebugImage;-><init>()V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v15, v4}, Lio/sentry/protocol/DebugImage;->setDebugId(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    move-object/from16 v22, v12

    .line 999
    .line 1000
    const-string v12, "elf"

    .line 1001
    .line 1002
    invoke-virtual {v15, v12}, Lio/sentry/protocol/DebugImage;->setType(Ljava/lang/String;)V

    .line 1003
    .line 1004
    .line 1005
    move-object/from16 v35, v14

    .line 1006
    .line 1007
    const/4 v12, 0x4

    .line 1008
    invoke-virtual {v11, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v14

    .line 1012
    invoke-virtual {v15, v14}, Lio/sentry/protocol/DebugImage;->setCodeFile(Ljava/lang/String;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v15, v2}, Lio/sentry/protocol/DebugImage;->setCodeId(Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v10, v4, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    goto :goto_10

    .line 1022
    :cond_24
    move-object/from16 v22, v12

    .line 1023
    .line 1024
    move-object/from16 v35, v14

    .line 1025
    .line 1026
    :goto_10
    const-string v2, "rel:"

    .line 1027
    .line 1028
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    iput-object v2, v1, Lio/sentry/protocol/a0;->t0:Ljava/lang/String;

    .line 1033
    .line 1034
    goto :goto_11

    .line 1035
    :cond_25
    move-object/from16 v22, v12

    .line 1036
    .line 1037
    move-object/from16 v35, v14

    .line 1038
    .line 1039
    :goto_11
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-object/from16 v4, v17

    .line 1043
    .line 1044
    goto/16 :goto_c

    .line 1045
    .line 1046
    :cond_26
    move-object/from16 v22, v12

    .line 1047
    .line 1048
    move-object/from16 v35, v14

    .line 1049
    .line 1050
    invoke-static {v13, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v12

    .line 1054
    if-eqz v12, :cond_29

    .line 1055
    .line 1056
    new-instance v4, Lio/sentry/protocol/a0;

    .line 1057
    .line 1058
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1059
    .line 1060
    .line 1061
    const/4 v15, 0x1

    .line 1062
    invoke-virtual {v13, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v10

    .line 1066
    invoke-virtual {v13, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    if-eqz v10, :cond_28

    .line 1071
    .line 1072
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 1073
    .line 1074
    .line 1075
    move-result v12

    .line 1076
    if-eqz v12, :cond_27

    .line 1077
    .line 1078
    goto :goto_12

    .line 1079
    :cond_27
    invoke-static {v10, v1, v2}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    :cond_28
    :goto_12
    iput-object v2, v4, Lio/sentry/protocol/a0;->h0:Ljava/lang/String;

    .line 1084
    .line 1085
    const/4 v1, 0x3

    .line 1086
    invoke-virtual {v13, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v10

    .line 1090
    iput-object v10, v4, Lio/sentry/protocol/a0;->g0:Ljava/lang/String;

    .line 1091
    .line 1092
    invoke-virtual/range {v24 .. v24}, Lio/sentry/s6;->getInAppIncludes()Ljava/util/List;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    invoke-virtual/range {v24 .. v24}, Lio/sentry/s6;->getInAppExcludes()Ljava/util/List;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v10

    .line 1100
    invoke-static {v2, v1, v10}, Lio/sentry/z;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    iput-object v1, v4, Lio/sentry/protocol/a0;->m0:Ljava/lang/Boolean;

    .line 1105
    .line 1106
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1107
    .line 1108
    iput-object v1, v4, Lio/sentry/protocol/a0;->o0:Ljava/lang/Boolean;

    .line 1109
    .line 1110
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    goto/16 :goto_c

    .line 1114
    .line 1115
    :cond_29
    invoke-static {v6, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v1

    .line 1119
    if-eqz v1, :cond_2a

    .line 1120
    .line 1121
    if-eqz v4, :cond_1f

    .line 1122
    .line 1123
    new-instance v1, Lio/sentry/t5;

    .line 1124
    .line 1125
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1126
    .line 1127
    .line 1128
    const/4 v15, 0x1

    .line 1129
    iput v15, v1, Lio/sentry/t5;->X:I

    .line 1130
    .line 1131
    invoke-virtual {v6, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v10

    .line 1135
    iput-object v10, v1, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 1136
    .line 1137
    invoke-virtual {v6, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v2

    .line 1141
    iput-object v2, v1, Lio/sentry/t5;->Z:Ljava/lang/String;

    .line 1142
    .line 1143
    const/4 v2, 0x3

    .line 1144
    invoke-virtual {v6, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v10

    .line 1148
    iput-object v10, v1, Lio/sentry/t5;->f0:Ljava/lang/String;

    .line 1149
    .line 1150
    iput-object v1, v4, Lio/sentry/protocol/a0;->x0:Lio/sentry/t5;

    .line 1151
    .line 1152
    invoke-static {v9, v1}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/e0;Lio/sentry/t5;)V

    .line 1153
    .line 1154
    .line 1155
    goto/16 :goto_c

    .line 1156
    .line 1157
    :cond_2a
    invoke-static {v3, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v1

    .line 1161
    if-eqz v1, :cond_2b

    .line 1162
    .line 1163
    if-eqz v4, :cond_1f

    .line 1164
    .line 1165
    new-instance v1, Lio/sentry/t5;

    .line 1166
    .line 1167
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1168
    .line 1169
    .line 1170
    iput v2, v1, Lio/sentry/t5;->X:I

    .line 1171
    .line 1172
    const/4 v15, 0x1

    .line 1173
    invoke-virtual {v3, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v10

    .line 1177
    iput-object v10, v1, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 1178
    .line 1179
    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    iput-object v2, v1, Lio/sentry/t5;->Z:Ljava/lang/String;

    .line 1184
    .line 1185
    const/4 v2, 0x3

    .line 1186
    invoke-virtual {v3, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v10

    .line 1190
    iput-object v10, v1, Lio/sentry/t5;->f0:Ljava/lang/String;

    .line 1191
    .line 1192
    iput-object v1, v4, Lio/sentry/protocol/a0;->x0:Lio/sentry/t5;

    .line 1193
    .line 1194
    invoke-static {v9, v1}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/e0;Lio/sentry/t5;)V

    .line 1195
    .line 1196
    .line 1197
    goto/16 :goto_c

    .line 1198
    .line 1199
    :cond_2b
    invoke-static {v7, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v1

    .line 1203
    if-eqz v1, :cond_2c

    .line 1204
    .line 1205
    if-eqz v4, :cond_1f

    .line 1206
    .line 1207
    new-instance v1, Lio/sentry/t5;

    .line 1208
    .line 1209
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1210
    .line 1211
    .line 1212
    const/4 v12, 0x4

    .line 1213
    iput v12, v1, Lio/sentry/t5;->X:I

    .line 1214
    .line 1215
    const/4 v15, 0x1

    .line 1216
    invoke-virtual {v7, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v10

    .line 1220
    iput-object v10, v1, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 1221
    .line 1222
    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    iput-object v2, v1, Lio/sentry/t5;->Z:Ljava/lang/String;

    .line 1227
    .line 1228
    const/4 v2, 0x3

    .line 1229
    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v10

    .line 1233
    iput-object v10, v1, Lio/sentry/t5;->f0:Ljava/lang/String;

    .line 1234
    .line 1235
    iput-object v1, v4, Lio/sentry/protocol/a0;->x0:Lio/sentry/t5;

    .line 1236
    .line 1237
    invoke-static {v9, v1}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/e0;Lio/sentry/t5;)V

    .line 1238
    .line 1239
    .line 1240
    goto/16 :goto_c

    .line 1241
    .line 1242
    :cond_2c
    invoke-static {v8, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v1

    .line 1246
    if-eqz v1, :cond_2e

    .line 1247
    .line 1248
    if-eqz v4, :cond_2d

    .line 1249
    .line 1250
    new-instance v1, Lio/sentry/t5;

    .line 1251
    .line 1252
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1253
    .line 1254
    .line 1255
    iput v10, v1, Lio/sentry/t5;->X:I

    .line 1256
    .line 1257
    const/4 v15, 0x1

    .line 1258
    invoke-virtual {v8, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v10

    .line 1262
    iput-object v10, v1, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 1263
    .line 1264
    invoke-virtual {v8, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    iput-object v2, v1, Lio/sentry/t5;->Z:Ljava/lang/String;

    .line 1269
    .line 1270
    const/4 v2, 0x3

    .line 1271
    invoke-virtual {v8, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v10

    .line 1275
    iput-object v10, v1, Lio/sentry/t5;->f0:Ljava/lang/String;

    .line 1276
    .line 1277
    const/4 v12, 0x4

    .line 1278
    invoke-static {v8, v12}, Lio/sentry/android/core/internal/threaddump/b;->b(Ljava/util/regex/Matcher;I)Ljava/lang/Long;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v2

    .line 1282
    iput-object v2, v1, Lio/sentry/t5;->g0:Ljava/lang/Long;

    .line 1283
    .line 1284
    iput-object v1, v4, Lio/sentry/protocol/a0;->x0:Lio/sentry/t5;

    .line 1285
    .line 1286
    invoke-static {v9, v1}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/e0;Lio/sentry/t5;)V

    .line 1287
    .line 1288
    .line 1289
    :goto_13
    move-object/from16 v14, v29

    .line 1290
    .line 1291
    move-object/from16 v10, v30

    .line 1292
    .line 1293
    move-object/from16 v1, v32

    .line 1294
    .line 1295
    const/4 v2, 0x3

    .line 1296
    goto :goto_16

    .line 1297
    :cond_2d
    const/4 v12, 0x4

    .line 1298
    goto :goto_13

    .line 1299
    :cond_2e
    move-object/from16 v1, v32

    .line 1300
    .line 1301
    const/4 v12, 0x4

    .line 1302
    invoke-static {v1, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v14

    .line 1306
    if-eqz v14, :cond_31

    .line 1307
    .line 1308
    if-eqz v4, :cond_30

    .line 1309
    .line 1310
    new-instance v14, Lio/sentry/t5;

    .line 1311
    .line 1312
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 1313
    .line 1314
    .line 1315
    iput v10, v14, Lio/sentry/t5;->X:I

    .line 1316
    .line 1317
    const/4 v15, 0x1

    .line 1318
    invoke-virtual {v1, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v10

    .line 1322
    iput-object v10, v14, Lio/sentry/t5;->Y:Ljava/lang/String;

    .line 1323
    .line 1324
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v2

    .line 1328
    iput-object v2, v14, Lio/sentry/t5;->Z:Ljava/lang/String;

    .line 1329
    .line 1330
    const/4 v2, 0x3

    .line 1331
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v10

    .line 1335
    iput-object v10, v14, Lio/sentry/t5;->f0:Ljava/lang/String;

    .line 1336
    .line 1337
    iput-object v14, v4, Lio/sentry/protocol/a0;->x0:Lio/sentry/t5;

    .line 1338
    .line 1339
    invoke-static {v9, v14}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/e0;Lio/sentry/t5;)V

    .line 1340
    .line 1341
    .line 1342
    :goto_14
    move-object/from16 v14, v29

    .line 1343
    .line 1344
    :cond_2f
    :goto_15
    move-object/from16 v10, v30

    .line 1345
    .line 1346
    goto :goto_16

    .line 1347
    :cond_30
    const/4 v2, 0x3

    .line 1348
    goto :goto_14

    .line 1349
    :cond_31
    move-object/from16 v14, v29

    .line 1350
    .line 1351
    const/4 v2, 0x3

    .line 1352
    invoke-static {v14, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v20

    .line 1356
    if-eqz v20, :cond_32

    .line 1357
    .line 1358
    if-eqz v4, :cond_2f

    .line 1359
    .line 1360
    new-instance v15, Lio/sentry/t5;

    .line 1361
    .line 1362
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 1363
    .line 1364
    .line 1365
    iput v10, v15, Lio/sentry/t5;->X:I

    .line 1366
    .line 1367
    iput-object v15, v4, Lio/sentry/protocol/a0;->x0:Lio/sentry/t5;

    .line 1368
    .line 1369
    invoke-static {v9, v15}, Lio/sentry/android/core/internal/threaddump/b;->a(Lio/sentry/protocol/e0;Lio/sentry/t5;)V

    .line 1370
    .line 1371
    .line 1372
    goto :goto_15

    .line 1373
    :cond_32
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 1374
    .line 1375
    .line 1376
    move-result v10

    .line 1377
    if-eqz v10, :cond_34

    .line 1378
    .line 1379
    move-object/from16 v10, v30

    .line 1380
    .line 1381
    invoke-static {v10, v15}, Lio/sentry/android/core/internal/threaddump/b;->c(Ljava/util/regex/Matcher;Ljava/lang/String;)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v15

    .line 1385
    if-eqz v15, :cond_33

    .line 1386
    .line 1387
    goto :goto_17

    .line 1388
    :cond_33
    :goto_16
    move-object/from16 v32, v1

    .line 1389
    .line 1390
    move-object/from16 v30, v10

    .line 1391
    .line 1392
    move-object/from16 v29, v14

    .line 1393
    .line 1394
    move-object/from16 v12, v22

    .line 1395
    .line 1396
    move-object/from16 v10, v33

    .line 1397
    .line 1398
    move/from16 v2, v34

    .line 1399
    .line 1400
    move-object/from16 v14, v35

    .line 1401
    .line 1402
    move-object/from16 v1, p1

    .line 1403
    .line 1404
    goto/16 :goto_7

    .line 1405
    .line 1406
    :cond_34
    :goto_17
    invoke-static {v5}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1407
    .line 1408
    .line 1409
    new-instance v1, Lio/sentry/protocol/c0;

    .line 1410
    .line 1411
    invoke-direct {v1, v5}, Lio/sentry/protocol/c0;-><init>(Ljava/util/List;)V

    .line 1412
    .line 1413
    .line 1414
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1415
    .line 1416
    iput-object v2, v1, Lio/sentry/protocol/c0;->Z:Ljava/lang/Boolean;

    .line 1417
    .line 1418
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1419
    .line 1420
    .line 1421
    move-result v2

    .line 1422
    if-eqz v2, :cond_35

    .line 1423
    .line 1424
    goto/16 :goto_4

    .line 1425
    .line 1426
    :cond_35
    iput-object v1, v9, Lio/sentry/protocol/e0;->k0:Lio/sentry/protocol/c0;

    .line 1427
    .line 1428
    :goto_18
    if-eqz v9, :cond_36

    .line 1429
    .line 1430
    move-object/from16 v1, v28

    .line 1431
    .line 1432
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    :cond_36
    :goto_19
    move-object/from16 v1, p1

    .line 1436
    .line 1437
    move-object/from16 v3, v19

    .line 1438
    .line 1439
    move-object/from16 v5, v21

    .line 1440
    .line 1441
    move-object/from16 v6, v23

    .line 1442
    .line 1443
    move-object/from16 v7, v25

    .line 1444
    .line 1445
    move-object/from16 v8, v26

    .line 1446
    .line 1447
    move-object/from16 v4, v31

    .line 1448
    .line 1449
    move/from16 v2, v34

    .line 1450
    .line 1451
    goto/16 :goto_0

    .line 1452
    .line 1453
    :cond_37
    move-object v1, v10

    .line 1454
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v1

    .line 1458
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1459
    .line 1460
    .line 1461
    move-result v2

    .line 1462
    if-eqz v2, :cond_39

    .line 1463
    .line 1464
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v2

    .line 1468
    check-cast v2, Lio/sentry/protocol/e0;

    .line 1469
    .line 1470
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1471
    .line 1472
    iget-object v4, v2, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 1473
    .line 1474
    invoke-virtual {v3, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 1475
    .line 1476
    .line 1477
    move-result v4

    .line 1478
    if-eqz v4, :cond_38

    .line 1479
    .line 1480
    iput-object v11, v2, Lio/sentry/protocol/e0;->Z:Ljava/lang/String;

    .line 1481
    .line 1482
    iput-object v3, v2, Lio/sentry/protocol/e0;->g0:Ljava/lang/Boolean;

    .line 1483
    .line 1484
    iget-boolean v3, v0, Lio/sentry/android/core/internal/threaddump/b;->b:Z

    .line 1485
    .line 1486
    const/16 v16, 0x1

    .line 1487
    .line 1488
    xor-int/lit8 v3, v3, 0x1

    .line 1489
    .line 1490
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v3

    .line 1494
    iput-object v3, v2, Lio/sentry/protocol/e0;->h0:Ljava/lang/Boolean;

    .line 1495
    .line 1496
    goto :goto_1a

    .line 1497
    :cond_38
    const/16 v16, 0x1

    .line 1498
    .line 1499
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1500
    .line 1501
    iput-object v3, v2, Lio/sentry/protocol/e0;->g0:Ljava/lang/Boolean;

    .line 1502
    .line 1503
    iput-object v3, v2, Lio/sentry/protocol/e0;->h0:Ljava/lang/Boolean;

    .line 1504
    .line 1505
    iput-object v3, v2, Lio/sentry/protocol/e0;->j0:Ljava/lang/Boolean;

    .line 1506
    .line 1507
    goto :goto_1a

    .line 1508
    :cond_39
    return-void
.end method
